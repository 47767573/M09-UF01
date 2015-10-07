/**
 * 
 */
package Practica1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/**
 * @author 47767573t
 *
 */
public class Comunicacion {
	String ruta = "/home/47767573t/git/EclipseWorkSpace/M09/UF01/ProgramaC/alea";
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		new Comunicacion();
	}
	
	/**
	 * Abre el programa de alea que lanza numeros aleatorios con cada jugador implementado por teclado
	 * @throws IOException
	 */
	public Comunicacion() throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		String player;
		String salir = "";
		
		try{		
			while (!salir.equals("fi")){				
				
				System.out.println("jugador:");
				player = sc.next();				
				
				if (!player.equals("fi")){					
				
					Process alea = Runtime.getRuntime().exec(ruta);
		
					InputStream is = alea.getInputStream();
					InputStreamReader isr = new InputStreamReader (is);
				
					BufferedReader br = new BufferedReader (isr);
				
					String linia = br.readLine();
					
					System.out.println(linia.substring(9));				
					
				}else{
					System.out.println("adios!");
					salir = player;
				}				
			}		
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
