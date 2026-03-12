package es.iescamas.actividadesU9.Ejercicio9;

public class Reproductor  {
private Reproducible r;


public Reproductor(Reproducible r) {
	
	this.r = r;
	
}



public void reproducirPlay(Reproducible r) {
	
	this.r = r;
}


public void play() {
	
	r.play();
	
}

public void pause() {

	r.pause();

	
	
}




public void stop() {
	r.stop();
}
}