package ejercicios;
	import java.util.Scanner;

public class Ejercicio2 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int edad;
	        int sumaEdades = 0;
	        int contadorAlumnos = 0;
	        int mayoresEdad = 0;

	        System.out.println("Introduce las edades de los alumnos (número negativo para terminar):");

	        while (true) {
	            System.out.print("Edad del alumno: ");
	            edad = scanner.nextInt();

	            if (edad < 0) {
	                break;
	            }

	            sumaEdades = sumaEdades +edad;
	            contadorAlumnos++;

	            if (edad >= 18) {
	                mayoresEdad++;
	            }
	        }

	        if (contadorAlumnos > 0) {
	            double media = (double) sumaEdades / contadorAlumnos;

	            System.out.println("\n--- Estadísticas ---");
	            System.out.println("Total de alumnos: " + contadorAlumnos);
	            System.out.println("Suma de edades: " + sumaEdades);
	            System.out.printf("Media de edades: %.2f\n", media);
	            System.out.println("Alumnos mayores de edad: " + mayoresEdad);
	        } else {
	            System.out.println("No se introdujeron edades válidas.");
	        }
	    }
	    
	    }
