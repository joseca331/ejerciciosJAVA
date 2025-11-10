package actividades;
import java.util.Scanner;
public class Actividad10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		// leer n
		
		System.out.println("introduce los numeros a introducir: ");
		int n = sc.nextInt();
		
		
        // Leer y almacenar n números en la tabla original
		
		int[] valores = new int[n];
        System.out.println("Introduce los " + n + " números:");
        for (int i = 0; i < n; i++) {
            valores[i] = sc.nextInt();
        }

        // Contar cuántos pares hay
        int cuentaPares = 0;
        for (int i = 0; i < n; i++) {
            if (valores[i] % 2 == 0) {
                cuentaPares++;
            }
        }

        // Crear las tablas de pares e impares
        int[] valoresPares = new int[cuentaPares];
        int[] valoresImpares = new int[n - cuentaPares];

        // Volcar los valores en las tablas correspondientes
        int indicePares = 0;
        int indiceImpares = 0;
        for (int i = 0; i < n; i++) {
            if (valores[i] % 2 == 0) {
                valoresPares[indicePares++] = valores[i];
            } else {
                valoresImpares[indiceImpares++] = valores[i];
            }
        }

        // Mostrar resultados
        System.out.println("Números pares:");
        for (int num : valoresPares) {
            System.out.print(num + " ");
        }

        System.out.println("\nNúmeros impares:");
        for (int num : valoresImpares) {
            System.out.print(num + " ");
        }
    }
}