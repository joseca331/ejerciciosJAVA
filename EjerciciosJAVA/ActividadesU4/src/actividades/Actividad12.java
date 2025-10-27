package actividades;

import java.util.Scanner;

public class Actividad12 {
	public static double calculadora(int a, int b, int operacion) {
        double resultado = 0.0;

        switch (operacion) {
            case 1: // Suma
                resultado = a + b;
                break;
            case 2: // Resta
                resultado = a - b;
                break;
            case 3: // Multiplicación
                resultado = a * b;
                break;
            case 4: // División
                if (b != 0) {
                    resultado = (double) a / b;
                } else {
                    throw new Exception("no existe la operacion");
                }
                break;
            default:
               throw new Exception("no existe la operacion");

        return resultado;
    }

    
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	System.out.println("introduce un numero: ");
    	int num1 = sc.nextInt();
    	System.out.println("introduce otro numero: ");
    	int num2 = sc.nextInt();
    	
    	System.out.println("el resultado de la suma: " + calculadora(num1,num2,1));
    	System.out.println("el resultado resta:" + calculadora(num1,num2,2));
    	System.out.println("producto: " + calculadora(num1,num2,3));
    	System.out.println("division: " + calculadora(num1,num2,4) );
    	
    
}
	
}
