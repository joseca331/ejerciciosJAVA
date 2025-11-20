package ejercicios;
import java.util.Scanner;


public class Ejercicio2 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String []args) {
		
		
		Segundaversion(null, null);		
	}
	
    public static void PrimeraVersion() {
    
    
    	
    	// primer
    	System.out.println("introduce la contraseña: ");
    	
    	
    	
    	String contraseña = sc.nextLine();
    	
    	
    	
    	System.out.println("Pistas:");
    	
    	
        System.out.println("La contraseña tiene " + contraseña.length() + " caracteres.");
        System.out.println("Empieza por '" + contraseña.charAt(0) + "' y termina por '" + contraseña.charAt(contraseña.length() - 1) + "'.");
    	String intento;
    	
  
    	
		 do {
             System.out.print("Jugador 2, introduce tu intento: ");
             intento = sc.nextLine();

             if (!intento.equals(contraseña)) {
                 System.out.println("Incorrecto, sigue intentando...");
             }
         } while (!intento.equals(contraseña));

         System.out.println("¡Correcto! Has acertado la contraseña.");
     }
    	
    	
    public static void Segundaversion(String contraseña, String intento){
    	
    	System.out.println("introduce la contraseña: ");
    	
    	
    	contraseña = sc.nextLine();
    	
    	

    	do {
    		System.out.println("jugador 2: Introduce tu  intento: ");
    		 intento = sc.nextLine();
    		  if (intento.compareTo(contraseña) < 0) {
                  System.out.println("Tu intento está por debajo alfabéticamente.");
              } else {
                  System.out.println("Tu intento está por encima alfabéticamente.");
              }
          
      } while (!intento.equals(contraseña));
    	
    	
    	System.out.println("¡Correcto! Has acertado la contraseña.");
    }     	
    
}
    

