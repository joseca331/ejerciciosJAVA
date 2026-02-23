package es.texto;
/**
 * Notas rápidas para que el alumnado haga TDD “bien”

Empieza implementando constructores + getters + longitud().

Luego anadirFinal(char) y anadirInicio(char).

Después anadirFinal(String) y anadirInicio(String) con regla “todo o nada” (si no cabe, no modifica).

Finalmente contarVocales().
 */
public class Texto {

	
	 private String contenido;
	 private int maxLongitud;



	 public Texto(int maxLongitud) {
	        if (maxLongitud <= 0) {
	            throw new IllegalArgumentException("maxLongitud debe ser > 0");
	        }
	        this.maxLongitud = maxLongitud;
	        this.contenido = "";
	    }

	    public Texto(String contenidoInicial, int maxLongitud) {
	        if (maxLongitud <= 0) {
	            throw new IllegalArgumentException("maxLongitud debe ser > 0");
	        }
	        if (contenidoInicial == null) {
	            throw new IllegalArgumentException("contenidoInicial no puede ser null");
	        }
	        if (contenidoInicial.length() > maxLongitud) {
	            throw new IllegalArgumentException("contenidoInicial supera maxLongitud");
	        }

	        this.maxLongitud = maxLongitud;
	        this.contenido = contenidoInicial;
	    }

	 

	    public String getContenido() {
	        return contenido;
	    }

	    public int longitud() {
	        return contenido.length();
	    }

	    public boolean anadirFinal(char c) {
	        if (contenido.length() >= maxLongitud) {
	            return false;
	        }
	        contenido = contenido + c;
	        return true;
	    }

	    

	    public boolean anadirInicio(char c) {
	        if (contenido.length() >= maxLongitud) {
	            return false;
	        }
	        contenido = c + contenido;
	        return true;
	    }


	    public boolean anadirFinal(String cadena) {
	        if (cadena == null) {
	            throw new IllegalArgumentException("cadena no puede ser null");
	        }
	        if (cadena.length() == 0) {
	            return true; 
	        }
	        if (contenido.length() + cadena.length() > maxLongitud) {
	            return false;
	        }
	        contenido = contenido + cadena;
	        return true;
	    }

	   

	    public boolean anadirInicio(String cadena) {
	        if (cadena == null) {
	            throw new IllegalArgumentException("cadena no puede ser null");
	        }
	        if (cadena.length() == 0) {
	            return true;
	        }
	        if (contenido.length() + cadena.length() > maxLongitud) {
	            return false;
	        }
	        contenido = cadena + contenido;
	        return true;
	    }

	    
	    
		public int contarVocales() {
			int contador = 0;
			String vocales = "aeiouAEIOU";

			
			for (char c : contenido.toCharArray()) { 
				
				if (vocales.indexOf(c) != -1) { 
					 
	
					
					contador++; } 
				}
			
			return contador;
		}
		
		 
		
		
		
		public String toString() { 
			
			return contenido; 
			
		
		
		}
}


