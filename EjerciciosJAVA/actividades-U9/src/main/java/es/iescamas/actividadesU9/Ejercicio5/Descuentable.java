package es.iescamas.actividadesU9.Ejercicio5;

public interface Descuentable {
	
	double precioBase();
	
		
		default double precioFinal(double porcentaje) {
			return precioBase() * (1-porcentaje/100.0);
			
			
			
			
		}


}
