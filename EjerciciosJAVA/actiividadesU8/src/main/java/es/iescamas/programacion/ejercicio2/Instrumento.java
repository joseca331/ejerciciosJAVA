package es.iescamas.programacion.ejercicio2;

public abstract class Instrumento {

	
	final int notaMax = 100;
	protected Nota[] melodia = new Nota[notaMax];
	protected int numNotas;
	
	
	public boolean add(Nota nota) {
		
		if(numNotas < notaMax) {
			
			melodia [numNotas]= nota;
			numNotas++;
		}
		return false;
		
		
	}
	
	public abstract void interpretar();
	
}
	

