package Practica2;


import java.util.ArrayList;


public class Padre  {
	
	static ArrayList <String> al = new ArrayList <String> ();
	
	
	public static void main (String[] args) throws InterruptedException{
		
		
		Procesos[] hilos = new Procesos[99];
				
		
		// Generador de hilos
		for (int i = 0 ; i <= hilos.length ; i++){
			hilos[i] = new Procesos ("hilo"+(i+1),i*10);	
			hilos[i].start();
		}			
	}

	/**
	 * Añade elementos String en la array en la posición enviada
	 * @param n posicion donde introducir el String en el ArrayList
	 * @param str Texto a introducir en la posición determinada
	 */
	public void addToArray (int n, String str) {
		al.add(n, str);
	}

	
	/**
	 * conseguir numero de elementos introducidos en el arrayList
	 * @return numero de elementos introducidos en el arrayList
	 */
	public static int getTotalIntroducidos() {
		return al.size();
	}	
	
	
}
