package actividades;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Solicitar cantidad de números
	        System.out.print("¿Cuántos números deseas introducir?: ");
	        int n = sc.nextInt();

	        // Variables para estadísticas
	        int sumaPositivos = 0, sumaNegativos = 0;
	        int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;

	        // Leer n números
	        for (int i = 1; i <= n; i++) {
	            System.out.print("Introduce el número " + i + ": ");
	            int numero = sc.nextInt();

	            if (numero > 0) {
	                sumaPositivos += numero;
	                contadorPositivos++;
	            } else if (numero < 0) {
	                sumaNegativos += numero;
	                contadorNegativos++;
	            } else {
	                contadorCeros++;
	            }
	        }

	        // Mostrar resultados
	        
	        System.out.println("\nResultados:");
	        if (contadorPositivos > 0) {
	            double mediaPositivos = (double) sumaPositivos / contadorPositivos;
	            System.out.println("Media de los números positivos: " + mediaPositivos);
	        } else {
	            System.out.println("No se introdujeron números positivos.");
	        }

	        if (contadorNegativos > 0) {
	            double mediaNegativos = (double) sumaNegativos / contadorNegativos;
	            System.out.println("Media de los números negativos: " + mediaNegativos);
	        } else {
	            System.out.println("No se introdujeron números negativos.");
	        }

	        System.out.println("Cantidad de ceros introducidos: " + contadorCeros);

	    }
	
	
	
	
	
	}