package actividades;
import java.util.Scanner;


public class Actividad10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean lluvia, tarea, biblioteca, salir;
		
	System.out.println("responder con sí o no");
	
	// preguntar si llueve
	
	System.out.println("¿esta lloviendo?: ");
	lluvia = sc.nextBoolean();
		
		
	
	// preguntar si ha terminado la tarea
	
	System.out.println("¿has terminado la tarea?: ");

	tarea = sc.nextBoolean();
	// preguntar si va a la biblio
	
	System.out.println("¿vas a la bilioteca?:");
	
	biblioteca = sc.nextBoolean();
	
	// respuesta
	
	salir = (!lluvia && tarea) || (biblioteca);
	System.out.println("¿podra salir?: " + salir);
	
			
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
