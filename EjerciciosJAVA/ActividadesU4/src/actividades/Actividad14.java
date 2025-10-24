package actividades;

public class Actividad14 {
	
	public static int fibonacci(int n) {
		
		// si n es 0 o 1, devuelve 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Método principal para probar la función
    public static void main(String[] args) {
        int n = 10; // Cambia este valor para obtener otro término
        System.out.println("El término " + n + " de la serie de Fibonacci es: " + fibonacci(n));
    }
}

