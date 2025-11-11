package actividades;

public class Actividad14 {
	public static int contarAciertos(int[] apuesta, int[] ganadora) {
        int aciertos = 0; // contador de aciertos

        // Recorremos cada número de la apuesta
        for (int i = 0; i < apuesta.length; i++) {
            // Comprobamos si aparece en la combinación ganadora
            for (int j = 0; j < ganadora.length; j++) {
                if (apuesta[i] == ganadora[j]) {
                    aciertos++; // sumamos un acierto
                }
            }
        }
        return aciertos; // devolvemos el total
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int[] apuesta = {3, 15, 22, 28, 35, 42};
        int[] ganadora = {7, 15, 22, 28, 33, 42};

        int resultado = contarAciertos(apuesta, ganadora);
        System.out.println("Número de aciertos: " + resultado);
    }
}


