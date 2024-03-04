package ar.edu.unlp.info.oo1.reporteConstruccion;

public class Prisma extends Pieza {
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
	public Prisma(String material, String color, double ladoMayor, double ladoMenor, double altura) {
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}

	public double calcularVolumen() {
		return ladoMayor * ladoMenor * altura;
	}
	
	public double calcularSuperficie() {
		return 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura);
	}
	

}
