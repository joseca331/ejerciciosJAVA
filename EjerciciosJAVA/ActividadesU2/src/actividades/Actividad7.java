package actividades;
import java.util.Scanner;
public class Actividad7 {

	public static void main(String[] args) {

		
		

		        Scanner sc = new Scanner(System.in);

		        // Pedir los tres números
		        System.out.print("Introduce el primer número: ");
		        int num1 = sc.nextInt();

		        System.out.print("Introduce el segundo número: ");
		        int num2 = sc.nextInt();

		        System.out.print("Introduce el tercer número: ");
		        int num3 = sc.nextInt();

		        // Ordenar de mayor a menor
		        if (num1 > num2 && num1 > num3) {
		            if (num2 > num3) {
		                System.out.println(num1 + ", " + num2 + ", " + num3);
		            } else {
		                System.out.println(num1 + ", " + num3 + ", " + num2);
		            }
		        } else if (num2 > num1 && num2 > num3) {
		            if (num1 > num3) {
		                System.out.println(num2 + ", " + num1 + ", " + num3);
		            } else {
		                System.out.println(num2 + ", " + num3 + ", " + num1);
		            }
		        } else {
		            if (num1 > num2) {
		                System.out.println(num3 + ", " + num1 + ", " + num2);
		            } else {
		                System.out.println(num3 + ", " + num2 + ", " + num1);
		            }
		        }

		 
		    }
		}
