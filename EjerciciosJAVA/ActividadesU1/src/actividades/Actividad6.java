package actividades;
import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		System.out.println("introduce la primera nota: ");
		
		int nota1 = sc.nextInt();
		
		System.out.println("introduce la segunda nota");
		
		//especificamos las variables 
		int nota2 = sc.nextInt();
		
		//calculamos nota media

		double notaMedia = (nota1 + nota2)/2.0;
		
		//mostramos la nota media
		System.out.print("la nota media es: " + notaMedia);
		
		
		
		
		
		

	}

}
