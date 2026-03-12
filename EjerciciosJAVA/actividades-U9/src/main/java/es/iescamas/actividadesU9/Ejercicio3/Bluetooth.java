package es.iescamas.actividadesU9.Ejercicio3;

public class Bluetooth implements Conectable{

	
	private boolean estado;
	
	public Bluetooth () {
		this.estado = false;
		
		
		
	}
	
	@Override
	public void conectar() {

		estado = true;
	}

	@Override
	public void desconectar() {
estado = false;		
	}

	@Override
	public boolean estaConectado() {

		
		
		return estado;
	}

}
