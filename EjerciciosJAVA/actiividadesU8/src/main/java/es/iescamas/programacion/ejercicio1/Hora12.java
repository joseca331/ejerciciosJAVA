package es.iescamas.programacion.ejercicio1;

public class Hora12 extends Hora {
protected Periodo periodo;


	public Hora12(int hora, int minuto, Periodo periodo) {
		super(hora, minuto);
		this.periodo = periodo;
		
		

	}
	
	public void inc() {
		super.minuto++;
		if(super.minuto >59) {
			
			super.minuto=0;
			super.hora++;
			if(super.hora >12) {
				
				super.hora = 1;
			if(periodo.equals(Periodo.AM)) {
				periodo = Periodo.PM;
			}else {
				periodo = Periodo.AM;
				
				
				
			}
			
			}
			
		}
			
			
				
			}
			
		
		public String toString() {
				return String.format("%02d, %02d", hora, minuto);
		
	}

	
	
}
