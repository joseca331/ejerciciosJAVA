package es.iescamas.actividadesU9.Ejercicio4;

public class Tarjeta implements MetodoPago{

	private double saldoDisponible;
	private double limite;
	
	public Tarjeta(double saldoDisponible, double limite) {
		super();
		this.limite = limite;
		this.saldoDisponible = saldoDisponible;
		
		
	}
	
	@Override
	public boolean paga(double importe) {

		if(saldoDisponible >= importe && (limite >= importe)) {
			saldoDisponible -= importe;
			return true;
		}
		
		
		return false;}}
	
	
	
	


