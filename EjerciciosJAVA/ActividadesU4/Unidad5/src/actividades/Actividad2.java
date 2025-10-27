package actividades;
import java.util.Scanner;
public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("¿cuantos numeros deseas introducir?: ");
		int cantidad = sc.nextInt();
		
		int [] numeros = new int[cantidad];
		
		 for (int i = 0; i < cantidad; i++) {
	            System.out.print("introduce el número " + (i + 1) + ": ");
	            numeros[i] = sc.nextInt();
	        }
		 
		 System.out.println("el orden inverso: ");
		 for(int i = cantidad -1; i>= 0; i++) {
			 System.out.println(numeros[i]);
			 
		 }
	
	
	}

}
