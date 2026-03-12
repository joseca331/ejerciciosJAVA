package es.iescamas.actividadesU9.Ejercicio1;

public class Factura implements Imprimible{

	
		
		
	
	
	private int id;
	private String cliente;
	private double importe;
	
	
	public Factura(int id, String cliente, double importe) {
		this.id = id;
		this.cliente = cliente;
		this.importe = importe;
		
		
	}
	
	
	public int getId() {
		return id;
	}


	public String getCliente() {
		return cliente;
	}


	public double getImporte() {
		return importe;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public void setImporte(double importe) {
		this.importe = importe;
	}


	@Override
	public String imprimir() {

		return null;
	}
	
	
}


