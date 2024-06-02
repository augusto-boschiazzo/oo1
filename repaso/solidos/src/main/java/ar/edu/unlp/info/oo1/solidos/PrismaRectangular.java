package ar.edu.unlp.info.oo1.solidos;

public class PrismaRectangular extends Pieza{
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
	public PrismaRectangular(String material, String color, double ladoMayor, double ladoMenor, double altura) {
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
	
	public double getVolumen() {
		return ladoMayor * ladoMenor * altura;
	}
	
	public double getSuperficie() {
		return 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura);
	}
	
	
}
