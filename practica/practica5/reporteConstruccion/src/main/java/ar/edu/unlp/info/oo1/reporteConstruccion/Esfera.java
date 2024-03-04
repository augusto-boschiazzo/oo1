package ar.edu.unlp.info.oo1.reporteConstruccion;

public class Esfera extends Pieza {
	private double radio;
	
	public Esfera(String material, String color, double radio) {
		super(material, color);
		this.radio = radio;
	}

	public double calcularVolumen() {
		return 4 / 3 * Math.PI * radio * radio *radio;
	}
	
	public double calcularSuperficie() {
		return 4 * Math.PI * radio * radio;
	}
	

}
