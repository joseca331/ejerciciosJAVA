package actividades;
	import java.util.Scanner;
public class Actividad9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		        Scanner sc = new Scanner(System.in);
		int numero;
int cifras;
		        System.out.print("Introduce un número entre 0 y 99999: ");
		        numero = sc.nextInt();

		        if (numero < 0 || numero > 99999) {
		            System.out.println("Número fuera de rango. Debe estar entre 0 y 99999.");
		        } else {
		            

		            if (numero < 10) {
		                cifras = 1;
		            } else if (numero < 100) {
		                cifras = 2;
		            } else if (numero < 1000) {
		                cifras = 3;
		            } else if (numero < 10000) {
		                cifras = 4;
		            } else {
		                cifras = 5;
		            }

		            System.out.println("El número tiene " + cifras + " cifra(s).");
		        }

		      
		    }
		}
