package es.iescamas.actividadesU9.Ejercicio9;

public class Podcats implements Reproducible, Mostrable{

	private String titulo;
	private String autor;
	private double duracion;
	
	
	
	public Podcats(String titulo, String autor, int duracion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.duracion = duracion;
	}

	
	
	@Override
	public String mostrar() {

		return "titulo: " + titulo + "autor: " + autor + "duracion: " + duracion ;
	}

	@Override
	public void play() {

		System.out.println("se esta reproduciendo: " + titulo);
		
	}

	@Override
	public void pause() {
		
		System.out.println("esta pausado" + titulo);
		
	}

	@Override
	public void stop() {
		System.out.println("esta parado" + titulo);
		
	}
	
	
	
	

}
