package actividades;
import java.util.Scanner;
public class Actividad2 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;

                // pedir el primer número
                System.out.print("Introduce el primer número entero: ");
                numero1 = sc.nextInt();

                // pedir el segundo número
                System.out.print("Introduce el segundo número entero: ");
                numero2 = sc.nextInt();

                // Comparar los números
                if (numero1 == numero2) {
                    System.out.println("Los números son iguales.");
                } else {
                    System.out.println("Los números son diferentes.");
                }

                
            }
        


		

	}


