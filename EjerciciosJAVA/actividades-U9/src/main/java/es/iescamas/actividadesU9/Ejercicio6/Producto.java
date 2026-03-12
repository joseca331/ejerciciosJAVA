package es.iescamas.actividadesU9.Ejercicio6;

public class Producto implements Valorable{

	
	private int codigos;
	private String nombre;
	private double precio;
	

	
	
	
	
	
	public Producto(int codigos, String nombre, double precio) {
		super();
		this.codigos = codigos;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	
	
	
	@Override
	public String getNombre() {
		return nombre;
	}

	
	
	
	
	@Override
	public String toString() {
		return "Producto [codigos=" + codigos + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	


}
