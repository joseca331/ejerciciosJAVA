package es.iescamas.actividadesU9.Ejercicio8;

public class Usuario implements Validable, Mostrable{
	
	
	
	private String email;
	private String password;
	
	public Usuario (String email, String password) {
		super();
		this.email = email;
		this.password = password;
		
		
		
	}

	@Override
	public String mostrar() {
		
		return "email :" + email + "pass: " + password ;
	}

	@Override
	public void validar() throws IllegalArgumentException{

		if(email == null || !email.contains("@")) {
			
			

			throw new IllegalArgumentException("el email debe contener @ ");
			}
			if(password == null || password.length() < 8) {
			throw new IllegalArgumentException("la contraseña debe tener al menos 8 caracteres");

			
			
			}
			
		
	
}


	
	
}
		


	


