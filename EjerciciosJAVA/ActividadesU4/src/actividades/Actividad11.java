package actividades;

import java.util.Scanner;

public class Actividad11 {

	
	public class Potencia {

	    // Versión recursiva
	    public static double potenciaRecursiva(double a, int n) {
	        if (n == 0) {
	            return 1.0; // Caso base
	        } else {
	            return a * potenciaRecursiva(a, n - 1);
	        }
	    }

	    public static void main(String[] args) {
	        double a = 2.0;
	        int n = 5;
	        System.out.println("Recursiva: " + potenciaRecursiva(a, n)); // 2^5 = 32.0
	    }
	}}


