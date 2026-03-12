package es.iescamas.actividadesU9.Ejercicio5;

public class Producto implements Descuentable{
	
	
	private String nombre;
	private double precio;
	
	
		
	
	




	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}









	@Override
	public double precioBase() {
		// TODO Auto-generated method stub
		return precio;
	}
	

	
}
