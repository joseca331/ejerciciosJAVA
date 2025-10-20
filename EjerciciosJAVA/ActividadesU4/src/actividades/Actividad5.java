package actividades;

import java.util.Scanner;

public class Actividad5 {

	
	public static int mayor(int a, int b, int c) {
		
	        int mayor = (a > b) ? a : b;
	        mayor = (mayor > c) ? mayor : c;
	        return mayor;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("introduce el primer numero: ");
		int num1 = sc.nextInt();
		
		System.out.println("introduce el segundo nuemro: ");
		int num2 = sc.nextInt();
		
		
		System.out.println("introduce el tercer numero: ");
		
		int num3 = sc.nextInt();
		
        int mayor = mayor(num1, num2, num3);
    System.out.println(" el numero mayor es: " + mayor);
    
	
	}
	

}
