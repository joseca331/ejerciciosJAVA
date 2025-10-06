package actividades;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 int hora, minutos, segundos;
		 
	        // Solicitar hora, minutos y segundos
	        System.out.print("Introduce la hora (0-23): ");
	         hora = sc.nextInt();

	        System.out.print("Introduce los minutos (0-59): ");
	         minutos = sc.nextInt();

	        System.out.print("Introduce los segundos (0-59): ");
	         segundos = sc.nextInt();

	        // Mostrar hora actual, imprime la hora en formato [HH:MM:SS] con ceros a la izquierda y salto de línea al final
	        System.out.printf("Hora actual [%02d:%02d:%02d]%n", hora, minutos, segundos);

	        // Incrementar un segundo
	        segundos++;
	        if (segundos == 60) {
	            segundos = 0;
	            minutos++;
	            if (minutos == 60) {
	                minutos = 0;
	                hora++;
	                if (hora == 24) {
	                    hora = 0;
	                }
	            }
	        }

	        // Mostrar hora actual +1 segundo
	        System.out.printf("Hora actual +1 segundo [%02d:%02d:%02d]%n", hora, minutos, segundos);
	    }
	}