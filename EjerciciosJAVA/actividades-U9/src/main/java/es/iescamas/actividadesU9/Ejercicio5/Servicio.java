package es.iescamas.actividadesU9.Ejercicio5;

public class Servicio implements Descuentable {

	private String descripcion;
	



	private double tarifa;
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public Servicio(String descripcion, double tarifa) {
		super();
		this.descripcion = descripcion;
		this.tarifa = tarifa;
	}



	@Override
	public double precioBase() {
		// TODO Auto-generated method stub
		return tarifa;
	}
	
	

}
