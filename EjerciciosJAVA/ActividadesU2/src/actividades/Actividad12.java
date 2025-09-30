package actividades;
import java.util.Scanner;
public class Actividad12 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

		 int dia,mes,año;
		 
		 
	        System.out.print("Introduce el día: ");
	         dia = sc.nextInt();

	        System.out.print("Introduce el mes: ");
	         mes = sc.nextInt();

	        System.out.print("Introduce el año: ");
	         año = sc.nextInt();

	        boolean fechaCorrecta = false;

	        if (año >= 0) {
	            switch (mes) {
	                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	                    if (dia >= 1 && dia <= 31) fechaCorrecta = true;
	                    break;
	                case 4: case 6: case 9: case 11:
	                    if (dia >= 1 && dia <= 30) fechaCorrecta = true;
	                    break;
	                case 2:
	                    if (dia >= 1 && dia <= 28) fechaCorrecta = true;
	                    break;
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