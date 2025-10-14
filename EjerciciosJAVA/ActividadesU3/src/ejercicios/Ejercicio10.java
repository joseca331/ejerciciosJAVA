package ejercicios;
		import java.util.Scanner;		
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
        int numero;

        // Solicitar número entre 1 y 10
        do {
            System.out.print("Introduce un número entre 1 y 10: ");
            numero = SC.nextInt();
            
            if (numero < 1 || numero > 10) {
                System.err.println("Número fuera de rango. Inténtalo de nuevo.");
            }
        } while (numero < 1 || numero > 10);

        // Mostrar la tabla de multiplicar
        System.out.println("Tabla de multiplicar del " + numero + ":");
        // Multiplicar y mostrar resultados
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }
}