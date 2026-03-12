package es.iescamas.actividadesU9.Ejercicio2;

public class Enemigo implements Danable{
	
	private int vida;
	private String tipo;
	
	public Enemigo(int vida, String tipo){
		this.tipo = tipo;
		this.vida = vida;

	}

	public int getVida() {
		return vida;
	}

	public String getTipo() {
		return tipo;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void recibirDanio(int puntos) {
		vida-= puntos;
		System.out.println("el enemigo"+ tipo + "recibe" + puntos + "puntos de daño. vida quitada: " +vida);
		if(vida <=0) {
			System.out.println(tipo + "el enemigo esta KO");
		}
	}

}
