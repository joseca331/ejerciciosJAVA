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

    public static void main(String[] args) {
    	
    	
    	
        int n = 8; 
        
        
        System.out.println("El término " + n + " de la serie de fibonacci es: " + fibonacci(n));
    }
}

