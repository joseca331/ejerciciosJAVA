package actividades;
		import java.util.Scanner;
public class Actividad8 {

	public static void main(String[] args) {



		   
		        

        Scanner SC = new Scanner(System.in);

        // Pedir los coeficientes
        System.out.print("Introduce el coeficiente a: ");
        double a = SC.nextDouble();

        System.out.print("Introduce el coeficiente b: ");
        double b = SC.nextDouble();

        System.out.print("Introduce el coeficiente c: ");
        double c = SC.nextDouble();

        // Verificar que a no sea cero
        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado.");
        } else {
            // Calcular el discriminante
            double discriminante = b * b - 4 * a * c;

            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Soluciones reales:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (discriminante == 0) {
                double x = -b / (2 * a);
                System.out.println("Solución única real:");
                System.out.println("x = " + x);
            } else {
                System.out.println("No existen soluciones reales.");
            }
        }

    
    }
}
