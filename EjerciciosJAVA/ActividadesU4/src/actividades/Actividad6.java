package actividades;

import java.util.Scanner;

public class Actividad6 {
	
	 public static boolean esVocal(char c) {
	        c = Character.toLowerCase(c); // Convertimos a minúscula para comparar sin importar mayúsculas
	        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'); // // Comprobamos si es una vocal
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce un carácter: ");
	        char letra = sc.next().charAt(0);

	        if (esVocal(letra)) {
	            System.out.println(letra + " es una vocal.");
	        } else {
	            System.out.println(letra + " no es una vocal.");
	        }

	        
	        
	        
	        
	        
	       
	    }
	}
	
	

