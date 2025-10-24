package actividades;

import java.util.Scanner;

public class Actividad13 {

		   public static long factorial(int n) {
		        if (n < 0) {
		            return -1;
		        }
		        if (n == 0) {
		            return 1;
		        }
		        return n * factorial(n - 1);
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		       System.out.println("introduce un numero: ");
		       int num1 = sc.nextInt();
		       
		       
		       
		  

		        long resultado = factorial(num1);

		        if (resultado == -1) {
		            System.out.println("No se puede calcular el factorial de un número negativo.");
		        } else {
		            System.out.println("el factorial de " + num1 + " es: " + resultado);
		        }

		    }}    