package ejemplosBucles;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	
	int opcion;
	
	do {
		
		System.out.println("1) Saludar 2) Despedir 0) Salir");

		
		opcion = sc.nextInt();
		
		switch (opcion) {
		
		
		case 1 -> System.out.println("hola");
		case 2 -> System.out.println("adios");
		case 0 -> System.out.println("saliendo...");
		default -> System.out.println("opcion no valida");
		
		
		}
		
		
	}
	while (opcion !=0);
	
	
	
	}

}
