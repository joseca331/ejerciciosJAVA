package es.iescamas.actividadesU9.Ejercicio9;

public class Cancion implements Reproducible, Mostrable{
private String titulo;

private String autor;
private double duracion;

	
	
	public Cancion(String titulo, String autor, double duracion) {
	super();
	this.titulo = titulo;
	this.autor = autor;
	this.duracion = duracion;
}

	@Override
	public String mostrar() {
		return "titulo canciion: " + titulo + "autor: " + autor + "duracion: " + duracion;
	}

	@Override
	public void play() {

		System.out.println("se esta reproduciendo" + titulo);
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
