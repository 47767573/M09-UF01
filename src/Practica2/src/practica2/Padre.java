package practica2;


import java.util.ArrayList;
import java.util.Scanner;

public class Padre  {
	
	static ArrayList <String> al = new ArrayList <String> ();
	
	
	/**
	 * Pregunta por pantalla numero de hilos, general los hilos y los arranca
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main (String[] args) throws InterruptedException{
		Scanner scn  = new Scanner (System.in);		
		
		System.out.println("Cuantos hilos desea hacer?");
		int hilosMax = scn.nextInt();
		
		Procesos[] hilos = new Procesos[hilosMax];				
		
		// Generador de hilos y los pone en marcha
		for (int i = 0 ; i <= hilos.length-1 ; i++){
			hilos[i] = new Procesos ("hilo"+(i+1),i*10);	
			hilos[i].run();
		}
	
	scn.close();
	}	
}
