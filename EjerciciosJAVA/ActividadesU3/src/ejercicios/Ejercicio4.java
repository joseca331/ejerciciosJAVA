package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime un numero <n>");
		
		int n = sc.nextInt();
		
		if (n < 1) {
            System.out.println("Por favor, introduce un número mayor que 0.");
        } else {
            System.out.println("Contando del 1 al " + n + ":");
            for (int i = 1; i <= n; i++) {
                System.out.println(n);
            }}
	}

}
