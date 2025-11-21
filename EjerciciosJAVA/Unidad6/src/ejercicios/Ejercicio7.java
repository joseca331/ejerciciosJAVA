package ejercicios;
import java.util.Scanner;
public class Ejercicio7 {
		static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		// Solicitar frase y palabra
		
		System.out.println("introduce una frase: ");
		String frase = sc.nextLine();
		
		System.out.println("Introduce una palabra: ");
		String palabra = sc.nextLine();
		
		
		
        // Inicializar contador y posición
		
		
		int contador = 0;
		int posicion = 0;
		
		
		// buscar la palabra en la frase
		
		while((posicion = frase.indexOf(palabra, posicion))!= - 1) {
			
			contador ++;
			posicion = posicion + 1;
			
			
			
			
			
			
			
		
			
			
			
		}
		
		System.out.println("la palabra " + palabra + " aparece este numero de veces: " + contador);
	}

}
