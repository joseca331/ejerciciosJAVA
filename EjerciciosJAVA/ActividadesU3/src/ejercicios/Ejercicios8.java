package ejercicios;
	import java.util.Scanner;
public class Ejercicios8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Calcular el factorial
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        // Mostrar el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}