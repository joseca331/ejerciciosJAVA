package actividades;
import java.util.Scanner;
public class Actividad13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
{
        Scanner sc = new Scanner(System.in);

        //pedimos las notas de cada trimestre 
        
        
        
        
        System.out.print("Introduce la nota del primer trimestre  ");
        int nota1 = sc.nextInt();
        
        
        
              

        System.out.print("Introduce la nota del segundo trimestre: ");
        int nota2 = sc.nextInt();

        System.out.print("Introduce la nota del tercer trimestre: ");
        int nota3 = sc.nextInt();

        // Calcular la media
        double media = (nota1 + nota2 + nota3) / 3;

        // Mostrar resultados
        System.out.println(" Nota boletin : " +  media);
        System.out.println(" Nota expediente: " + media);
    }
}



