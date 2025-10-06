package ejemplosBucles;
import java.util.Scanner;
public class TablaMultiplicar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.print("Introduce un número: ");
		

        numero = sc.nextInt();

        
        
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
        	
        	
        	
        	
        	
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
	}

}
