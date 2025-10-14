package ejercicios;
	import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int etiqueta = 0;
        int altura;
        int maxAltura = 0;
        int etiquetaMax = -1;

        System.out.println("Introduce la altura de cada árbol en centímetros (usa -1 para terminar):");

        while (true) {
            System.out.print("Árbol " + etiqueta + ": ");
            altura = sc.nextInt();

            if (altura == -1) {
                break;
            }

            if (altura > maxAltura) {
                maxAltura = altura;
                etiquetaMax = etiqueta;
            }

            etiqueta++;
        }

        if (etiquetaMax != -1) {
            System.out.println("El árbol más alto es el número " + etiquetaMax + " con una altura de " + maxAltura + " cm.");
        } else {
            System.out.println("No se introdujeron alturas válidas.");
        }

       
    }
}