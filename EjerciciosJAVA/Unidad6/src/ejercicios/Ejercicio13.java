package ejercicios;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduzca una frase: ");
		String frase = sc.nextLine().toLowerCase();
		
		int[] contador = new int[27];
		
		for(int i = 0; i< frase.length();i++) {
			
			
			char c = frase.charAt(i);
            if (c >= 'a' && c <= 'z') { 
                contador[c - 'a']++;   
                
            }
        }


		
		
		System.out.println("Resultado:");
		
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > 0) {
            
            	
            	
            	
            	char letra = (char) ('a' + i);
               
                
              
      System.out.println(letra + " : " + contador[i] + " veces");
            }
        }
			
		}
			
			
		

		
	}


