package actividades;
import java.util.Scanner;
public class Actividad12 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

		 int dia,mes,año;
		 
		 //Solicita al usuario que introduzca el día, mes y año
	        System.out.print("Introduce el día: ");
	         dia = sc.nextInt();

	        System.out.print("Introduce el mes: ");
	         mes = sc.nextInt();

	        System.out.print("Introduce el año: ");
	         año = sc.nextInt();

	         // Variable para indicar si la fecha es válida
	        boolean fechaCorrecta = false;

	        if (año >= 0) {
	            switch (mes) {
	            // Meses con 31 días
	           
	                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	                    if (dia >= 1 && dia <= 31) fechaCorrecta = true;
	                    break;
	                    
	                 // Meses con 30 días
	                case 4: case 6: case 9: case 11:
	                    if (dia >= 1 && dia <= 30) fechaCorrecta = true;
	                    break;
	                    
	                    // Febrero 
	                case 2:
	                    if (dia >= 1 && dia <= 28) fechaCorrecta = true;
	                    break;
	                    
	                    // Mes inválido
	                default:
	                    fechaCorrecta = false;
	            }
	        }

	        if (fechaCorrecta) {
	            System.out.println("La fecha es correcta.");
	        } else {
	            System.out.println("La fecha no es válida.");
	        }

	}
	}