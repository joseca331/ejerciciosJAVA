package actividades;

import java.util.Random;
import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random random = new Random();
		
		System.out.print("Elige la longitud de la combinación: ");
        int longitud = sc.nextInt();

        // Crear y rellenar la combinación secreta
        
        
        int[] combinacion = new int[longitud];
        for (int i = 0; i < longitud; i++) {
        
        	
        	combinacion[i] = random.nextInt(5) + 1; // números del 1 al 5
        }
        int[] intento = new int[longitud];
        int fallos;

        System.out.println("\n¡Intenta adivinar la combinación secreta!");
        
        
        do {
        	
        	fallos = 0;
        	
        	for (int i = 0; i < longitud; i++) {
                System.out.print("Dígito " + (i + 1) + ": ");
                intento[i] = sc.nextInt();
        	if(intento[i] < combinacion[i]) {
        		System.out.println("mayor");
        		
        		
        	
        	} else if (intento[i] > combinacion[i]) {
                     System.out.println("→ Menor");
                     fallos++;
                 } else {
                     System.out.println("→ Igual");
                 }
             }
             if (fallos > 0) {
                 System.out.println("\nNo has acertado todos los dígitos. Intenta de nuevo.\n");
             }

         } while (fallos != 0);

         System.out.println("\n¡Felicidades! Has descubierto la combinación secreta.");
         sc.close();
         
     }

}
