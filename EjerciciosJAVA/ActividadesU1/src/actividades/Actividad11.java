package actividades;
import java.util.Scanner;


public class Actividad11 {

	public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
	// definir variables
	double manzana1, pera1, manzana2, pera2;
	// precios constantes durante el año
	final double Precio_manzana = 2.35;
	final double Precio_pera = 1.95;
	
	// definimos las variables de los beneficios y total
	double manzanaBeneficios, perasBeneficios, totalBeneficios;
	
	
	// preguntar cuantas peras y manzanas ha vendido
	

	System.out.println("¿cuantos kg de manzanas has vendido en el primer semestre?: ");
	
	manzana1 = sc.nextDouble();
	
	
	System.out.println("¿cuantos kg de manzanas has vendido en el segundo semestre?:");
	
	manzana2 = sc.nextDouble();
	
	
	System.out.println("¿cuantos kg de peras has vendido en el primer trimestre?:");
	
	
	pera1 = sc.nextDouble();
	
	
	
	
	
	System.out.println("¿cuantos kg de peras has vendido en el segundo semestre?:");
	
	pera2 = sc.nextDouble();
	
	
	
	
	
	
	// calcular las ganacias de cada fruta en cada semestre
	
	
	manzanaBeneficios = (manzana1 * Precio_manzana) + (manzana2 * Precio_manzana);
	
	perasBeneficios = Precio_pera * (pera1 + pera2);
	
	totalBeneficios = manzanaBeneficios + perasBeneficios;
	
	
	
	//mostrar resultados
	
	
	
	System.out.println("total " + totalBeneficios);
	
	
	
	
	
	
	
	
	
	

	}

}
