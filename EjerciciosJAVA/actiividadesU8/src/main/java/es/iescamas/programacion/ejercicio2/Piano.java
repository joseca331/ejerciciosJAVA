package es.iescamas.programacion.ejercicio2;

public class Piano extends Instrumento {

	
	public Piano() {
		
		super();
	}
	
	@Override
	public void interpretar() {

		System.out.println("el piano interpretando: ");
		
		for(int i = 0; i < numNotas;i++ ) {
			System.out.println("[" + melodia[i] + "]");
		}
		
		System.out.println();
		
		
	}
	
	 

}
