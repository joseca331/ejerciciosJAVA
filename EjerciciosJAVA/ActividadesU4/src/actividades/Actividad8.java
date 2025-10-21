package actividades;
import java.util.Scanner;
public class Actividad8 {

	

	

		    // Verifica si un número es primo
		    public static boolean esPrimo(int n) {
		        if (n < 2) return false; // Los números menores que 2 no son primos
		        for (int i = 2; i <= Math.sqrt(n); i++) {
		            if (n % i == 0) return false;
		        }
		        return true;
		    }

		    // Cuenta los divisores primos de un número
		    public static int contarDivisoresPrimos(int numero) {
		        int contador = 0;
		        for (int i = 2; i <= numero; i++) {
		            if (numero % i == 0 && esPrimo(i)) {
		                contador++;
		            }
		        }
		        return contador;
		    }

		    // Programa principal que interactúa con el usuario
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Introduce un número entero positivo: ");
		        int numero = scanner.nextInt();

		        if (numero <= 0) {
		            System.out.println("Por favor, introduce un número mayor que cero.");
		        } else {
		            int cantidad = contarDivisoresPrimos(numero);
		            System.out.println("El número " + numero + " tiene " + cantidad + " divisores primos.");
		        }

		    }
		}
