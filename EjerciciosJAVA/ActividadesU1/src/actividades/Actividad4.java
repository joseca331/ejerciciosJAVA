package actividades;
import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Dime tu año de nacimiento: ");
		
		int year = sc.nextInt();
		
		
		System.out.println("dime el año actual: ");
		int yearActual = sc.nextInt();
		
		// Calcular la edad
		
		
		int edadUsuario = yearActual - year;
		
		
		System.out.print("la edad actual es: " + edadUsuario);
		
		
		
	}

}
