package ejercicios;
import java.util.Scanner;
public class Ejercicio8 {
 static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		
	
		
		// pedir al usuario 
		System.out.println("escribe una frase: ");
		String frase = sc.nextLine();
		
		// quitar espacios 
		
		String n = frase.replaceAll(" ","" ).toLowerCase();
		
		
		// invertir frase 
		
		String invertida = new StringBuilder(n).reverse().toString();
		
		
		// comparar
		
		if (n.equals(invertida)) {
			System.out.println("La frase es palíndroma");
			
			
		}else 
			
			System.out.println("La frase no es palíndroma ");
		
	}

}
