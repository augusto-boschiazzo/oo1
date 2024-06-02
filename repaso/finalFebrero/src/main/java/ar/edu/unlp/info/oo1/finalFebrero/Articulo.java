package ar.edu.unlp.info.oo1.finalFebrero;

public class Articulo implements Producto {
	private double costo;
	private double costoEnvioPorKilo;
	private double peso;
	private String nombre;
	
	public Articulo(double costo, double costoEnvioPorKilo, double peso, String nombre) {
		super();
		this.costo = costo;
		this.costoEnvioPorKilo = costoEnvioPorKilo;
		this.peso = peso;
		this.nombre = nombre;
	}
	
	public double costoEnvio() {
		return costoEnvioPorKilo * peso;
	}
	
	public double costo() {
		return costo + this.costoEnvioPorKilo;
	}
	
	public String toString() {
		String aux = "Nombre: " + nombre + " Costo: " + this.costo;
		return aux;
	}
	

}
