package es.iescamas.actividadesU9.Ejercicio4;

public class Bizum implements MetodoPago{

	private double saldo;
	private int telefono;
	
	
	public Bizum (double saldo, int telefono) {
		
		this.saldo = saldo;
		this.telefono = telefono;
		
		
		
		
	}
	
	
	
	@Override
	public boolean paga(double importe) {
if(importe <= saldo) {
	saldo -= importe;
	
	return true;
}

		return false;
	}



	public double getSaldo() {
		return saldo;
	}



	public int getTelefono() {
		return telefono;
	}
	
	
	
	

}
