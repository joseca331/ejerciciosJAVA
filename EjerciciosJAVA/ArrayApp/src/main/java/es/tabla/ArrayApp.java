package es.tabla;

public class ArrayApp {


	public int[] invertirArray(int[] original) {
		
		
		int[] invertido = new int[original.length];
	    

		for (int i = 0; i < original.length; i++) {

			invertido[i] = original[original.length - 1 - i];
	    }
		
		return invertido;
	}

	public double mediaPositivos(int[] t) {

	
	int suma = 0;
    int contador = 0;

    for (int num : t) {
        if (num > 0) {
            suma += num;
            contador++;
        }
    }

    return (contador == 0) ? 0 : (double) suma / contador;
}


	
public double mediaNegativos(int[] t) {
    int suma = 0;
    int contador = 0;

    for (int num : t) {
        if (num < 0) {
            suma += num;
            contador++;
        }
    }

    return (contador == 0) ? 0 : (double) suma / contador;
}




public int cuentaCeros(int[] t) {
    int contadorCeros = 0;

    for (int num : t) {
        if (num == 0) {
            contadorCeros++;
        }
    }

    return contadorCeros;
}





public int[] borrarElemento(int[] t, int pos) {

	
	if(pos < 0 || pos > t.length) {
		
	throw new IllegalArgumentException("posicion invalida");			
		
	
	}
		
	// nuevo array
	
	 int[] tablaCopia = new int[t.length - 1];
	 // indice de la nueva array
	 
     int j = 0;

     for (int i = 0; i < t.length; i++) {
        
         if (i != pos) {
             tablaCopia[j++] = t[i];
         }
     }

     return tablaCopia;
 }

public int[] sinRepetidos(int[] t) {

	
	
	
	
		
	return null;
}

 

	
	

}


