package ar.edu.unlp.objetos.uno.balanzaElectronica;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto(double peso, double precioPorKilo, String descripcion) {
		this.peso = peso;
		this.precioPorKilo = precioPorKilo;
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return this.peso * this.precioPorKilo;
	}

	public double getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Producto [peso=" + peso + ", precioPorKilo=" + precioPorKilo + ", descripcion=" + descripcion + "]";
	}
	
	
}
