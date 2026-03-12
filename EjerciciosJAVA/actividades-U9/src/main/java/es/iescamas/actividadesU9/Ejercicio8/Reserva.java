package es.iescamas.actividadesU9.Ejercicio8;

public class Reserva implements Validable, Mostrable{

	private String fecha;
	private int numPersonas;
	
	
	@Override
	public String mostrar() {

		return null;
	}

	@Override
	public void validar() throws IllegalArgumentException {
		
		
		if(numPersonas < 0) {
			
			throw new IllegalArgumentException("el numero de personas debe ser mayor a 0");
		}
		
	}
	
	
	

}
