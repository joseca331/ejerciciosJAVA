package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Declaro las variables
		int minimo, maximo;

		// Solicita al usuario que introduzca el rango
		System.out.println("Dime el valor minimo del rango: ");
		// Lee el valor minimo
		minimo = sc.nextInt();
		// solicita al usuario que introduzca el valor maximo
		System.out.println("Dime el valor maximo del rango: ");
		// Lee el valor maximo
		maximo = sc.nextInt();
		// Verificar que el valor minimo no sea mayor que el maximo
		if (minimo > maximo) {
			System.out.println("Error: el valor mínimo no puede ser mayor que el máximo.");
		} else {
			int numero;
			do {
				System.out.print("Introduce un número dentro del rango [" + minimo + ", " + maximo + "]: ");
				numero = sc.nextInt();
                // Verifica si el número está dentro del rango
				if (numero < minimo || numero > maximo) {
					System.err.println("El número no está dentro del rango. Intenta de nuevo.");
				}
				
			} while (numero < minimo || numero > maximo);

			
			System.out.println("¡Correcto! El número " + numero + " está dentro del rango.");
		}
	}

	
}
