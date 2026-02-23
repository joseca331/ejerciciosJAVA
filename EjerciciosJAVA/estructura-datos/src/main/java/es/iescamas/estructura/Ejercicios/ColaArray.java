package es.iescamas.estructura.Ejercicios;

public class ColaArray extends ListaArray{
	
	public ColaArray() {
		super();
		
	}	
	public void enqueue (Integer n) {
		if(n!= null)
			super.addFinal(n);
		
	}

	public Integer dequeue() {
	if(! isEmpty()) {
			return super.remove(0);

		
	}else 
		return null;
			
	}

	public Integer first() {
	if(isEmpty())
		return null;
		return super.get(0);
	}
public boolean isEmpty() {
		
	return super.size() == 0;
		
	
}}
