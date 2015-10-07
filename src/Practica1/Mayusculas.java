package Practica1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Mayusculas {

	String ruta = ("/home/47767573t/git/EclipseWorkSpace/M09/UF01/ProgramaC/a.out");
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		new Mayusculas();
	}
	
	/**
	 * Abre el programa de alea que lanza numeros aleatorios con cada jugador implementado por teclado
	 * @throws IOException
	 */
	public Mayusculas() throws IOException{
		
		
		Scanner sc = new Scanner(System.in);
		
		String wordMinus;
		
		
		try{						
			System.out.println("Introduzca la palabra: ");
			wordMinus = sc.next();				
					
			Process mayus = Runtime.getRuntime().exec(ruta);
			OutputStream os = mayus.getOutputStream();			
			
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write(wordMinus);
			bw.flush();
			
			
			InputStream is = mayus.getInputStream();
			InputStreamReader isr = new InputStreamReader (is);
			
			BufferedReader br = new BufferedReader (isr);
			
			String linia = br.readLine();
			
			
			
			System.out.println(linia);	
			
			//String linia = br.readLine();
			//System.out.println(linia);
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		sc.close();
	}
}
