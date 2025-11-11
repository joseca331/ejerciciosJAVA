package actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
        int aux;
        int[] favoritos = {3, 7, 33};

        do {
            // pedir al usuario el indice de un elemento
            System.out.println("Dime el índice: ");
            int indice = sc.nextInt();

            if (indice >= favoritos.length || indice < 0) {
                continue;
            }

            // guardamos el último número de la tabla
            aux = favoritos[favoritos.length - 1];

            // reducimos el tamaño del array
            favoritos = Arrays.copyOf(favoritos, favoritos.length - 1);

            // reemplazamos el valor en el índice indicado
            favoritos[indice] = aux;

            mostrarTabla(favoritos);

        } while (favoritos.length > 0);

        sc.close();
	}
	
	

    public static void mostrarTabla(int[] tabla) {
        for (int elemento : tabla) {
            System.out.print(elemento + "\t");
        }
        System.out.println();
    }
}