package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
	public static char codifica(char conjunto1[], char conjunto2[], char c) {
        // Pasamos el carácter a minúscula para unificar la salida
        char minuscula = Character.toLowerCase(c);

        
        
        
        
        
        
        
        
        // Buscamos si está en el conjunto1
        for (int i = 0; i < conjunto2.length; i++) {
            if (minuscula == conjunto2[i]) {
            	
            		return conjunto1[i];
           }}
        return minuscula;    
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		char [] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's','t', 'u', 'v' };
		char [] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		
		System.out.println("introduce un texto:  ");
		String texto = sc.nextLine();
		
		StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            resultado.append(codifica(conjunto1, conjunto2, c));
        }

        // Mostramos el resultado
        System.out.println("Texto decodificado: " + resultado.toString());

		
		
		
		
		
		
		
	}
	
	
	
}

	

