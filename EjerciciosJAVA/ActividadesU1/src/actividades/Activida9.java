package actividades;
import java.util.Scanner;

public class Activida9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("introduce un numero: ");
				
		boolean esPar = numero % 2 == 0;

		numero = sc.nextInt();
		
		esPar = (numero % 2 == 0);	
		
		
		System.out.println("¿es par? " + esPar);
		

	}

}
