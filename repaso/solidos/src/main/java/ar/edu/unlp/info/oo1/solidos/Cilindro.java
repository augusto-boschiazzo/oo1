package ar.edu.unlp.info.oo1.solidos;

public class Cilindro extends Pieza	{
	private double radio;
	private double altura;
	
	public Cilindro(String material, String color, double radio, double altura) {
		super(material, color);
		this.radio = radio;
		this.altura = altura;
	}
	
	public double getVolumen() {
		return altura * radio * radio * Math.PI;
	}
	
	public double getSuperficie() {
		return 2 * Math.PI * radio * radio + 2 * Math.PI * radio * altura;
	}
	
	
}
