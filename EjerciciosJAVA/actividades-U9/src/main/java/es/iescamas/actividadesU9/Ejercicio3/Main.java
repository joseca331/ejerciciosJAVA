package es.iescamas.actividadesU9.Ejercicio3;

public class Main {

	
	public static void main(String[]args) {
		
		
		Bluetooth b1 = new Bluetooth ();
		
		if(b1.estaConectado()) {
			
			System.out.println("no esta conectado");
			
			
		}else 
			System.out.println("esta conectado");
	}
}
