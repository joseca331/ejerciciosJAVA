package es.iescamas.actividadesU9.Ejercicio4;

public class Caja {
	
	
	public void cobrar( MetodoPago mp, double importe ) {
		
	
		mp.paga(importe);
		System.out.println(mp.paga(importe));
		
		
	}

}
