package practica2;

import java.util.Random;


public class Procesos extends Thread {
	
	private String nombre;
	private int posInicial;
	
	public Procesos(String nombre, int posInicial) {
		this.nombre = nombre;
		this.posInicial = posInicial;
	}
	
	@Override
	public void run (){
		Random rnd = new Random();	
		int posFinal = posInicial +10;		
		int alea;		
		
		for (int i = posInicial ; posInicial < posFinal ; posInicial++) {				
			String respuesta = "";
			alea = rnd.nextInt(9); 		
			
			respuesta += nombre+" en posicion "+posInicial+", con valor "+alea+", en orden "+(Padre.al.size()+1)+"º";					
			Padre.al.add(posInicial, respuesta);
		}		
	}
}
	
	