package es.iescamas.actividadesU9.Ejercicio3;

public class Cable implements Conectable{
	
	private boolean estado;
	
	
	
	public Cable() {
		
		
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
