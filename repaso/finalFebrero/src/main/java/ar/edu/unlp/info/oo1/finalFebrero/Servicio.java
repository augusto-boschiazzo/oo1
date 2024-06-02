package ar.edu.unlp.info.oo1.finalFebrero;

public class Servicio implements Producto {
	private int horasTrabajadas;
	private double valorHora;
	private String objetivo;
	
	public Servicio(int horasTrabajadas, double valorHora, String objetivo) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.valorHora = valorHora;
		this.objetivo = objetivo;
	}
	
	public double costo() {
		return horasTrabajadas * valorHora;
	}
	
	public String toString() {
		String aux = "Objetivo: " + objetivo + " Costo: " + this.costo();
		return aux;
	}
	

}
