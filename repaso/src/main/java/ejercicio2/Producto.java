package ejercicio2;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public double getPrecio() {
		return peso * precioPorKilo;
	}
	
	public double getPeso() {
		return peso;
	}
	

}
