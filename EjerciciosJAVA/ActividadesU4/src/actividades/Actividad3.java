package actividades;

public class Actividad3 {

	 public static void calcularCilindro(int opcion, double radio, double altura) {
	        double resultado;

	        
	        switch (opcion) {
	        
	        
	            case 1: 
	            	
	                resultado = 2 * Math.PI * radio * (radio + altura);
	                System.out.printf("El área del cilindro es: %.2f\n", resultado);
	                break;

	            case 2: 
	                resultado = Math.PI * Math.pow(radio, 2) * altura;
	                System.out.printf("El volumen del cilindro es: %.2f\n", resultado);
	                break;

	            default:
	                System.out.println("Opción inválida. Usa 1 para área o 2 para volumen.");
	        }
	    }

	    public static void main(String[] args) {

	    	calcularCilindro(1, 5, 10); // Área
	        calcularCilindro(2, 5, 10); // Volumen
	    }
	}