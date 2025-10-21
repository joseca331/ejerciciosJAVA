package actividades;
import java.util.Scanner;
public class Actividad9 {

	
	

	    // Verifica si un número es primo
	    public static boolean esPrimo(int n) {
	        if (n < 2) return false;
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }

	    // Muestra por consola todos los divisores primos del número dado
	    // y devuelve la cantidad de ellos
	    public static int divisoresPrimos(int numero) {
	        int contador = 0;
	        System.out.println("Divisores primos de " + numero + ":");
	        for (int i = 2; i <= numero; i++) {
	            if (numero % i == 0 && esPrimo(i)) {
	                System.out.println(i);
	                contador++;
	            }
	        }
	        return contador;
	    }

	    // Programa principal que pide un número al usuario
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce un número entero positivo: ");
	        int numero = sc.nextInt();

	        if (numero <= 0) {
	            System.out.println("Porfavor, introduce un número mayor que cero.");
	        } else {
	            int cantidad = divisoresPrimos(numero);
	            System.out.println("El número " + numero + " tiene " + cantidad + " divisores primos.");
	        }

	      
	    }
	}
