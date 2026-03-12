package es.iescamas.actividadesU9.Ejercicio7;

public class Producto implements Comparable<Producto>, Mostrable {

    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() { 
    	
    	
    	return codigo; }
    public String getNombre() { 
    	
    	
    	
    	return nombre; 
    	
    }
    public double getPrecio() { 
    	
    	
    	return precio; 
    	
    
    
    
    }

    @Override
    public int compareTo(Producto o) {
        int Comparacion = getNombre().compareTo(o.getNombre());
        if (Comparacion == 0) {
            return Double.compare(getPrecio(), o.precio);
        }
        return Comparacion;
    }

    @Override
    public String mostrar() {
        return "Producto[codigo=" + codigo +
               ", nombre=" + nombre +
               ", precio=" + precio + "]";
    }
    
}
