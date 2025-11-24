package ejercicios;
import java.util.Scanner;
public class Ejercicio9 {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// leer frase
		
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine()	;
		
		
		// definir muletillas
		
		String inicio = "Javalín, javalón";
		String fin ="javalén,len,len";
		String mensaje = null;
		
		
		
		// COMPROBAR SI EMPIEZA POR LA MULETILLA INICIAL
		
		
		if (frase.startsWith(inicio)) {
			
			// quitar muletilla
			mensaje = frase.substring(inicio.length());
			
			// borrar los espacios y tabuladores en los extremos
			mensaje = mensaje.trim();
			
			
			
		}
		
		else if (frase.endsWith(fin)) {
			
			mensaje = frase.substring(0,frase.length()- fin.length());
			mensaje = mensaje.trim()	;
			
		}
		
	
	if ( mensaje != null) {
		
		System.out.println("la frase esta en idioma de Javalandia: ");
		System.out.println("mensaje traducido: " + mensaje);
	
	}else 
		System.out.println("la frase no esta en idioma de Javalandia");
	
	
	}
	
		
		
	}
	
