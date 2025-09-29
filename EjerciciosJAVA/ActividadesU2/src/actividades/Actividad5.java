package actividades;
import java.util.Scanner;


public class Actividad5 {

	public static void main(String[] args) {
// defino las variables
		float num;
        Scanner sc = new Scanner(System.in);
// pido al usuario que introduzca un numero decimal
		System.out.println("intoduce un numero decimal: ");
		num = sc.nextFloat();
		
	
		        // Verificar si el número está entre -1 y 1, excluyendo el 0
		        if (num > -1 && num < 1 && num != 0) {
		            System.out.println("El número es casi cero ");
		        } else {
		            System.out.println("El número no es casi cero ");
		        }

		    }
		

		
		
	}


