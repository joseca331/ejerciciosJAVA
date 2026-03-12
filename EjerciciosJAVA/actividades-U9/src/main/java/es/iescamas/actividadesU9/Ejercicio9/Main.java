package es.iescamas.actividadesU9.Ejercicio9;

public class Main {
	
	
	public static void main(String[] args) {

		

		Cancion c1 = new Cancion("PEPE", "Manuel Gomez", 2);
		Cancion c2 = new Cancion("Lo", "Felipe Luiz", 4);
		Podcats p1 = new Podcats("F", "Luis Manel", 56);
		
		
		Reproductor r = new Reproductor(c1);
		
		Reproductor r2 = new Reproductor(c2);
		
		Reproductor r3 = new Reproductor(p1);
		
		Reproductor[] reproductor = new Reproductor[3];

reproductor[0] = r;
reproductor[1]= r2;
reproductor[2] = r3;

for(int i = 0; i < reproductor.length; i++){
	
	
	reproductor[i].play();
	
}
		
	 {
			
			
	}	
		
	}

}
