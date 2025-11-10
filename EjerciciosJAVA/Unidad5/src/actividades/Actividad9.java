package actividades;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
final int alumnos = 5;
final int trimestres = 3;
int [][] notas = new int[alumnos][trimestres];
		
		
		// Leer las notas
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print("  Nota del trimestre " + (j + 1) + ": ");
                notas[i][j] = sc.nextInt();
            }
        }

        // Calcular y mostrar la media del grupo en cada trimestre
        for (int j = 0; j < 3; j++) {
            int sumaTrimestre = 0;
            for (int i = 0; i < 5; i++) {
                sumaTrimestre += notas[i][j];
            }
            double mediaTrimestre = (double) sumaTrimestre / 5;
            System.out.printf("Media del grupo en el trimestre %d: %.2f%n", j + 1, mediaTrimestre);
        }
        
        // leer posicion del alumno
        
        System.out.println("introduce la posicion del alumno: ");
        
        
        
        
	}
	
	
	

}
