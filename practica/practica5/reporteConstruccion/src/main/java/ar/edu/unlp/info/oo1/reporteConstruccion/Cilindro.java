package ar.edu.unlp.info.oo1.reporteConstruccion;

public class Cilindro extends Pieza {
	private double radio;
	private double altura;
	
	public Cilindro(String material, String color, double radio, double altura) {
		super(material, color);
		this.radio = radio;
		this.altura = altura;
	}
	
	public double calcularVolumen() {
		return Math.PI * radio * radio * altura;
	}
	
	public double calcularSuperficie() {
		return 2 * Math.PI * radio * altura + 2 * Math.PI * radio * radio;
	}

}
