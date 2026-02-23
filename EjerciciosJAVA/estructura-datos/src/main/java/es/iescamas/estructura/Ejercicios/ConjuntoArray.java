package es.iescamas.estructura.Ejercicios;

public class ConjuntoArray extends ListaArray {

	public ConjuntoArray() {
		
		super();
		
	}
	
	
	public boolean add(Integer n) {
		if(!this.constains(n)) {
			
			super.addFinal(n);
			
		
		
		return true;
		
		
		
		
		
		
		
	}
	
	


	private boolean constains(Integer n) {
		
		for(Integer numero : super.getTabla()) {
			
			if(numero == num) 
				return false;
				
				
			}
		
		
		
		
		
		return false;
	}
	
	
	public boolean removeValue(Integer n) {
		
		if(constains(n)) {
			
				for(int i = 0; i<super.size()-1;i++) {
					
					Integer elemento = super.get(i);
					if(elemento == n) {
						super.remove(i);
					
					return true;
				
					
				}
				
			}
			
	
			
			}return false;
	}
		}
		
	
	
	}}

