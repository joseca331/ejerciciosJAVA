package es.iescamas.actividadesU9.Ejercicio2;

public class Jugador implements Danable {

	private String nombre;
	private int vida;
	
	
	
	public Jugador(int vida, String nombre) {
		
		this.vida = vida;
		this.nombre = nombre;
		
	}
	public String getNombre() {
		return nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	@Override
	public void recibirDanio(int puntos) {
		vida-= puntos;
				System.out.println(nombre+ "recibe" + puntos + "puntos de daño. vida quitada: " +vida);
				if(vida <=0) {
					System.out.println(nombre + "KO");
				}
	}
	
	
}
