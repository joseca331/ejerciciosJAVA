package actividades;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {

		int numero;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entre 0 y 9999: ");
        numero = sc.nextInt();

        if (numero < 0 || numero > 9999) {
            System.out.println("Número fuera de rango.");
            
            
        } else if (numero < 10) {
        	
        
         System.out.println("El número no es capicúa.");
            
            
            
        } else if (numero < 100) {
        	
        	
            int unidades = numero % 10;
            int decenas = numero / 10;
            
            
            if (unidades == decenas) {
            	
            	
                System.out.println("El número es capicúa.");
                
                
            } else {
                System.out.println("El número no es capicúa.");
            }
            
            
        } else if (numero < 1000) {
        	
            int centenas = numero / 100;
            
            int unidades = numero % 10;
            
            if (centenas == unidades) {
            	
                System.out.println("El número es capicúa.");
                
            } else {
                System.out.println("El número no es capicúa.");
                
            }
        } else {
            int mil = numero / 1000;
            int centena = (numero / 100) % 10;
            int decena = (numero / 10) % 10;
            int unidad = numero % 10;
            if (mil == unidad && centena == decena) {
                System.out.println("El número es capicúa.");
            } else {
                System.out.println("El número no es capicúa.");
            }
        }

        
    }
}