package es.iescamas.actividadesU9.Ejercicio6;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Valorable[] v = new Valorable[4];

		Valorable p1 = new Producto(1, "p1", 10.2);
		Valorable p2 = new Producto(2, "p2", 18.2);
		Valorable p3 = new Producto(3, "p3", 17.7);
		Valorable p4 = new Producto(4, "p4", 14.0);
		{

			Valorable[] tabla = { p1, p2, p3, p4 };

			OrdenarPorPrecioAscYNombre(tabla);
			System.out.println(Arrays.toString(tabla));

		}

	}

	static void OrdenarPorPrecioAscYNombre(Valorable[] tabla) {

		// Idea (burbuja):
		
		for (int i = 0; i < tabla.length - 1; i++) {
			for (int j = 0; j < tabla.length - 1 - i; j++) {
				if( tabla[j].getPrecio() > tabla[j+1].getPrecio()) {
					
				}
			}

		}
	}
}
