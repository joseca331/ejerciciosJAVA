package es.iescamas.actividadesU9.Ejercicio5;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		Descuentable[] descuentable = new Descuentable[10];
		Producto p = new Producto("PC", 1000.0);
		Servicio s = new Servicio("Reparacion",30.0);
		descuentable[0] = p;
		descuentable[1]= s;
		
		for(Descuentable des : descuentable) {
		if(des != null) {
			
			System.out.println("Base: " + des.precioBase()+ " descuento: " + des.precioFinal(10));
		}
			
			
		}
		
		
	}

}
