package ejercicios;

public class Persona {


		// atributos 
	
	private String nombre;

	private int edad;
	
	// metodos
	
	public Persona(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;

	}
	
	
	public void saluda() {
		
		System.out.println("hola" + nombre);
		
	}

	public String getNombre() {
		
		return nombre;
	}

}
