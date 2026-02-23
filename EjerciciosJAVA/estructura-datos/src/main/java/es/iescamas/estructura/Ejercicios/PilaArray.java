package es.iescamas.estructura.Ejercicios;

public class PilaArray extends ListaArray{

	
public PilaArray() {
	
	super();

		

	}

public void push(Integer n) {
	if(n!= null)
	super.addFinal(n);
	
}




public int size() {
	return super.size();
	
	
	
}
	
	public boolean isEmpty() {
		
		return super.size() == 0;
		
	}
	

	
	public Integer pop() {
		
if(isEmpty())
	return null;

	}else {
		

		return super.remove(super.size()-1);
		
		
	
	
		
	}
	
	
	public Integer peek() {
		
		if(isEmpty())
			return null;

			}else {
				

				
				
		
		
		
		
	}
}
