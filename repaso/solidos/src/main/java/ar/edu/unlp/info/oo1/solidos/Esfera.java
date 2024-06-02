package ar.edu.unlp.info.oo1.solidos;

public class Esfera extends Pieza{
	private double radio;

	public Esfera(String material, String color, double radio) {
		super(material, color);
		this.radio = radio;
	}
	
	public double getVolumen() {
		return 4 / 3 * Math.PI * radio * radio * radio;
	}
	
	public double getSuperficie() {
		return 4 * Math.PI * radio * radio;
	}
	
	
}
