package actividades;

import java.util.Scanner;

public class Actividad7 {
public static boolean esprimo (int numero) {
	 if (numero <= 1) return false; // Los números menores o iguales a 1 no son primos

     for (int i = 2; i <= Math.sqrt(numero); i++) {
         if (numero % i == 0) return false; // Si tiene algún divisor, no es primo
     }
	
}

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("introduce un numero: ");
	
	int numero = sc.nextInt();
	
	
}
	
	
}
