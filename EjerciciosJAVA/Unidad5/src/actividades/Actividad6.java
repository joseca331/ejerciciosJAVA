
package actividades;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		
		
		
	}
		
		
		
		 public static int[] leerPuntuaciones( int cantidad, String mensaje) {
		        
				Scanner sc = new Scanner (System.in);

			 int[] puntos = new int[cantidad];
		        System.out.println(mensaje);
		        for (int i = 0; i < cantidad; i++) {
		            System.out.print("Puntuación " + (i + 1) + ": ");
		            puntos[i] = sc.nextInt();
		        }
		        return puntos;
		    }
		
		
		
	    public static void ordenarYMostrar(int[] puntos, String mensaje) {
	    	
	    	
	   
	   
	    Arrays.sort(puntos);
        System.out.println("\n" + mensaje);
        mostrarArray(puntos);
    }
	    
	    
	    public static void mostrarArray(int[] array) {
	        for (int punto : array) {
	            System.out.print(punto + " ");
	        }
	        System.out.println();
	    }
	    
	}