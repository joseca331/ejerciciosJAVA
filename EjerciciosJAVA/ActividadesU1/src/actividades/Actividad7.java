package actividades;
import java.util.Scanner;



public class Actividad7 {

	public static void main(String[] args) {
		//definimos las variables
		
		Scanner sc = new Scanner(System.in);
		double radio, longitud, area;
		//constante PI
		
		final double Pi = Math.PI;
		
		
		System.out.println("introduce el radio: ");
	
		radio = sc.nextFloat();
		
		//calculemos -> LONGITUD = 2 x PI x Radio
		
		 
		longitud = 2 * Pi * radio;		
			
		//calculamos area
		
		
		area = Pi * radio * radio;
		
		
		// mostramos
		
		System.out.print("la longitud de radio: " + radio + "es" + longitud);
		
		System.out.print("el area de radio " + radio + "es" + area);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
