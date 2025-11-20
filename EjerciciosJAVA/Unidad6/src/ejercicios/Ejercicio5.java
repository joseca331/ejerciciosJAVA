package ejercicios;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		
		// pedir nombre
		
		System.out.println("introduzca tu nombre completo:  ");
		String nombre =sc.nextLine();
		
		
		
		
		// definir las vocales
		
		String vocales = "aeiouAEIOUáéíúóÁÉÍÓÚ";
		
				
		//construir la nueva cadena sin vocales 

		
	        StringBuilder resultado = new StringBuilder();
	        for (int i = 0; i < nombre.length(); i++) {
	            char c = nombre.charAt(i);
	            
	            // si no esta en la lista de vocales añadimos la letra
	            if (vocales.indexOf(c) == -1) { 
	                resultado.append(c);
	            }
	        }
	
		
		// mostrar el resultado
		
	System.out.println("nombre sin vocales: " + resultado.toString());	;
	
	        
	}
	

}






