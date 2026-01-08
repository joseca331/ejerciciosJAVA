package ejercicios;

public class Main {
    public static void main(String[] args) {
        try {
        	
        	
            // Constructor con saldo inicial
        	
        	
            CuentaCorriente cuenta = new CuentaCorriente(200);
            System.out.println("Cuenta creada con saldo inicial:" );
            System.out.println(cuenta.mostrarInformacion());

            

            // Constructor con saldo, límite y DNI
            CuentaCorriente prueba2 = new CuentaCorriente(500, -50, "12345678A");
            System.out.println("\nCuenta creada con saldo y límite:");
            System.out.println(prueba2.mostrarInformacion());

            prueba2.sacarDinero(550);
            System.out.println("Después de sacar dinero : " + prueba2.mostrarInformacion());

            // Constructor con nombre y DNI
            CuentaCorriente prueba3 = new CuentaCorriente("Juan Pérez", "87654321B");
            System.out.println("\nCuenta creada con nombre y DNI:");
            System.out.println(prueba3.mostrarInformacion());

            prueba3.ingresarDinero(100);
            
            System.out.println("Después de ingresar: " + prueba3.mostrarInformacion());
           
            prueba3.sacarDinero(120); 
            
            System.out.println("Después de sacar: " + prueba3.mostrarInformacion());

            // Probar mostrarInformacion
            
            System.out.println("\n mostrarInformacion con TipoInformacion:");
            System.out.println("Saldo cuenta: " + prueba3.mostrarInformacion(TipoInformacion.SALDO));
            System.out.println("DNI cuenta: " + prueba3.mostrarInformacion(TipoInformacion.DNI));
            System.out.println("Nombre cuenta: " + prueba3.mostrarInformacion(TipoInformacion.NOMBRE));

            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
