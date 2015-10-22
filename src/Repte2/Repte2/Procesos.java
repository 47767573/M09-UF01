package Repte2;

import java.util.Random;
import java.util.Calendar;
import java.util.Date;


public class Procesos extends Thread {
	
	private String nombre;
	private int tipo;
	private Date inicio = new Date();
	
	public Procesos(String nombre, int tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}

	
	@Override
	public void run (){
		Random rnd = new Random();	
		
		for (int i=0; i<3 ; i++){
			
			if (tipo == 1){
				Date fin = new Date();
				int num = rnd.nextInt(9);
				System.out.println(nombre+"--> "+num);
				for (int s = 0 ; s<2 ; s++){
					System.out.println("\t"+i);
				}
				
			}else if (tipo == 2){
				int num = rnd.nextInt(9)+1;
				System.out.println(nombre+"--> "+num);
				//long tiempoTotal = (tiempoFin - tiempo)/1000;
			}
			
		}
	}
	
	
	
	
}
