package actividades;
import java.util.Scanner;
public class Actividad11 {

	public static void main(String[] args) {
		int nota;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una nota entre 0 y 10: ");
        nota = sc.nextInt();

        if (nota >= 0 && nota <= 4) {
            System.out.println("insuficiente");
        } else if (nota == 5) {
            System.out.println("suficiente");
        } else if (nota == 6) {
            System.out.println("ien");
        } else if (nota == 7 || nota == 8) {
            System.out.println("Notable");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota fuera de rango. Debe estar entre 0 y 10.");
        }

    
	}}
