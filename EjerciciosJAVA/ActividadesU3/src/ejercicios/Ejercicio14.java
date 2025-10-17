package ejercicios;
import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		
		System.out.print("Introduce un numero para crear el triangulo:  ");
		int n = sc.nextInt();

				
			
		
        
		// Dibujar el triángulo rectángulo
        	
		
			
		for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
               System.out.println();
        }

        sc.close();
    }
}
