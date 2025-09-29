package actividades;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2;

		System.out.println("introduce dos numeros distintos\n dime el primer numero: ");
		num1 = sc.nextInt();

		System.out.println("introduce el segundo numero diferente: ");

		num2 = sc.nextInt();

		if (num1 > num2) {

			System.out.println("el numero " + num1 + " es mayor");

		} else

			System.out.println("el numero " + num2 +  "  es mayor : ");

	}

}
