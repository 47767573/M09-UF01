package Repte2;


public class Padre  {
	
	public static void main (String[] args) throws InterruptedException{
		Procesos proc1 = new Procesos ("proceso1", 1);
		Procesos proc2 = new Procesos ("proceso2", 2);
		
		proc1.start();
		proc2.start();
		
		
		
	}
		
}
