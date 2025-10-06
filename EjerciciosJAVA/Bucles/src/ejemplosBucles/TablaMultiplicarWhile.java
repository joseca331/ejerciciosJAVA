package ejemplosBucles;
import java.util.Scanner;
public class TablaMultiplicarWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero; 
		System.out.println("Introduce un numero: ");
		
		numero = sc.nextInt();
		
		int i = 1;
		
		
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        
    }
		
		
		
		

	}

}
