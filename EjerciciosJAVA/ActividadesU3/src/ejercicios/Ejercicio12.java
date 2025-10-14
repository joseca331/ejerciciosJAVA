package ejercicios;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {

		
		
		        Scanner sc = new Scanner(System.in);
		        int[] notas = new int[5];
		        boolean haySuspenso = false;

		        // Pedir 5 calificaciones
		        for (int i = 0; i < 5; i++) {
		            System.out.print("Introduce la calificación del alumno " + (i + 1) + ": ");
		            notas[i] = sc.nextInt();
		            // Verificar si hay algún suspenso
		            if (notas[i] < 5) { 
		            	haySuspenso = true;
		            }
		        }

		        // Mostrar resultado
		        if (haySuspenso) {
		            System.out.println("Hay al menos un alumno suspenso.");
		        } else {
		            System.out.println("Todos los alumnos han aprobado.");
		        }

		    }
		}
