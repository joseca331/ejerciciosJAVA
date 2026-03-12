package es.iescamas.actividadesU9.Ejercicio4;

public class Efectivo implements MetodoPago{

	private double dineroEnCaja;
	public Efectivo(double dineroEnCaja) {
		
		super();
		this.dineroEnCaja = dineroEnCaja;
	}
	
	@Override
	public boolean paga(double importe) {
if(importe <= dineroEnCaja ) {
	
	dineroEnCaja -= importe;
	
	return true;
}
		
		return false;
	}
	
	

}
