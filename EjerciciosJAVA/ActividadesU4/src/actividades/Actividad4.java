package actividades;

public class Actividad4 {
	 public static int obtenerMayor(int a, int b) {
	        return (a > b) ? a : b;
	    }

	    public static void main(String[] args) {
	        int num1 = 7880;
	        int num2 = 5;

	        int mayor = obtenerMayor(num1, num2);
	        System.out.println("El número mayor es: " + mayor);
	    }
}
