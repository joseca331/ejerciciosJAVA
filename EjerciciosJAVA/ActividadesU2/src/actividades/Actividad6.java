package actividades;
import java.util.Scanner;
public class Actividad6 {

	public static void main(String[] args) {
	
		
 Scanner sc = new Scanner(System.in);

		        // Pedir los dos números
		        System.out.print("Introduce el primer número: ");
		        int num1 = sc.nextInt();

		        System.out.print("Introduce el segundo número: ");
		        int num2 = sc.nextInt();

		        // Mostrar en orden decreciente
		        if (num1 > num2) {
		            System.out.println("Orden decreciente: " + num1 + ", " + num2);
		        } else {
		            System.out.println("Orden decreciente: " + num2 + ", " + num1);
		        }

		    }
	


		
		
	}


