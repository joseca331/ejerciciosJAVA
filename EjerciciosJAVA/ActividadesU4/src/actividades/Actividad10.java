package actividades;
import java.util.Scanner;
public class Actividad10 {
	public static int sumaDivisores(int n) {
		  int suma = 0;
	        for (int i = 1; i < n; i++) { 
	            if (n % i == 0) {
	                suma += i;
	            }
	        }
	        return suma;
	    }

	
	
	    public static boolean sonAmigos(int a, int b) {
	        if (a <= 0 || b <= 0) {
	            return false;
	        }
	        return sumaDivisores(a) == b && sumaDivisores(b) == a;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce el primer número: ");
	        int num1 = sc.nextInt();

	        System.out.print("Introduce el segundo número: ");
	        int num2 = sc.nextInt();

	        if (sonAmigos(num1, num2)) {
	            System.out.println(num1 + " y " + num2 + " son números amigos.");
	        } else {
	        	System.out.println(num1 + " y " + num2 + " no son números amigos");
	        	
	        	
	        }
	    }
	}