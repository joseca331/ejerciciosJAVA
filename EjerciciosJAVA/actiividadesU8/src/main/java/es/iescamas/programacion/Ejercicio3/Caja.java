package es.iescamas.programacion.Ejercicio3;

public class Caja {
	
	private final int ancho;
	private final int alto;
	private final int fondo;
	
	private Unidades u;
	
	
	public Caja(int ancho, int alto, int fondo, Unidades u) {
		
		super();
		
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.u = u;
		
		
		
	}
	
	
	public double geVolumen() {
		 double volumen = this.ancho * this.alto * this.fondo;
		if(this.u.equals(Unidades.cm))
			
			volumen = volumen / 1_000_000;
		

			
			return volumen;
		
		
		
	}


	@Override
	public String toString() {
		return "Caja [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", u=" + u + "]";
	}
	
	
	

}
