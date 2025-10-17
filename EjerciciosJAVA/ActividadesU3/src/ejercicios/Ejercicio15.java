package ejercicios;
	import java.util.Scanner;
public class Ejercicio15 {
		
	public static void main(String[] args) {
		
			        Scanner sc = new Scanner(System.in);
			        System.out.print("Introduce un número entero n: ");
			        int n = sc.nextInt();

			        int contadorPrimos = 0;

			        // Recorrer desde 2 hasta n
			        for (int i = 2; i <= n; i++) {
			            if (esPrimo(i)) {
			                System.out.println(i + " → primo");
			                contadorPrimos++;
			            } else {
			                System.out.println(i + " → no primo");
			            }
			        }

			        System.out.println("Total de números primos entre 2 y " + n + ": " + contadorPrimos);
			        sc.close();
			    }

			    // Método para verificar si un número es primo
			    public static boolean esPrimo(int numero) {
			        if (numero < 2) return false;
			        for (int i = 2; i <= Math.sqrt(numero); i++) {
			            if (numero % i == 0) return false;
			        }
			        return true;
			    }
			}