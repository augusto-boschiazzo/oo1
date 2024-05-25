package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Circulo implements Figura {
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public Circulo() {
		
	}
	
	public double getDiametro() {
		return radio * 2;
	}
	
	public void setDiametro(double valor) {
		radio = valor / 2;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double valor) {
		radio = valor;
	}
	
	public double getPerimetro() {
		return Math.PI * getDiametro();
	}
	
	public double getArea() {
		return Math.PI * radio * radio;
	}
	

}
