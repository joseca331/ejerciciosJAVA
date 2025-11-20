package ejercicios;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// pedir al usuario
		
		System.out.println("introduzca una frase: ");
		String frase = sc.nextLine();
		
		
		
		// ContadorEspacios
		
		int contadorEspacios = 0;
		
		
		
        // Recorremos la frase carácter a carácter
		
		for(int i = 0; i < frase.length(); i++) {
			
			
			if (frase.charAt(i) == ' ') {
                contadorEspacios++;
                
                
			
			
			}
			
		}
		
		
		System.out.println("la frase tiene " + contadorEspacios + "  espacios " );
		
		
	}
	

}
