package actividades;

public class Actividad12 {

    public static int[][] crearMatriz(int filas, int columnas) {
       
    	int[][] matriz = new int[filas][columnas];
        
     // Dos bucles anidados: recorren filas y columnas
       
        for (int f = 0; f < filas; f++) {
            
        	
        	for (int c = 0; c < columnas; c++) {
               
            	
            	// En cada posición se guarda la suma de los índices
                matriz[f][c] = f + c;
            }
        }
        // Se devuelve la matriz ya rellenada
        
        return matriz;
    }

public static void mostrarMatriz(int[][]matriz) {
	
	for(int f = 0; f < matriz.length; f++) {
		
		for (int c = 0; c < matriz[f].length; c++) {
            // Imprime el valor seguido de un espacio
            System.out.print(matriz[f][c] + " ");
        }

		
		System.out.println();
    }
}
	

public static void main(String[] args) {
    // Se crea una matriz de 5×5 usando la función crearMatriz
    int[][] tabla = crearMatriz(5, 5);
    
    // Se muestra la matriz en consola usando mostrarMatriz
    mostrarMatriz(tabla);
}
}
  