package ejercicios;

import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("escribe una palabra o frase: ");
		
		String palabra1 = sc.nextLine();

		System.out.println("escribe una segunda palabra o frase: ");
		String 	palabra2 = sc.nextLine();
		
		
		if (palabra1.length() != palabra2.length()) {
			
			
			System.out.println("no son anagramas (diferentes longitudes)");
			
			
		}else {
			
			
		char[] letras1 = palabra2.toCharArray();
		char[] letras2 = palabra1.toCharArray();
		
		
		Arrays.sort(letras1);;
		Arrays.sort(letras2);
		
	
		
		 if (Arrays.equals(letras1, letras2)) {
             System.out.println("Las palabras son anagramas.");
         } else {
             System.out.println("Las palabras NO son anagramas.");
         }
     }

	}
	
		
	
	}


