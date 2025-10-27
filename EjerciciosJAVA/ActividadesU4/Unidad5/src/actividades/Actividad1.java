package actividades;
import java.util.Scanner;
public class Actividad1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] numeros = new double[5];
		
		System.out.println("introduce cinco numeros: ");
		for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
            
		}
            System.out.println("los numeros introducidos son:");
            
            for(double numero: numeros )
            	
            {
            	System.out.println(numero);
            }
        }

	}


