package ejercicios;
import java.util.Scanner;

//	Introducir por teclado dos palabras e indicar cuál de ellas 
//es la más corta, es decir, la que contiene menos caracteres



public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("introduce la primera palabra: ");
		String palabra1 = sc.nextLine()	;
		
		System.out.println("introduce la segunda palabra: ");
		String palabra2 = sc.nextLine()	;
		
		
		if (palabra1.length() > palabra2.length()) {
			System.out.println("la segunda palabra es mas corta ");
			
			
			
		}else if (palabra2.length() == palabra1.length()) {
			System.out.println("son iguales");
			
			
		}else {
			
			
			System.out.println("la primera palabra es mas corta");
		}
		
	
		
	}

}
