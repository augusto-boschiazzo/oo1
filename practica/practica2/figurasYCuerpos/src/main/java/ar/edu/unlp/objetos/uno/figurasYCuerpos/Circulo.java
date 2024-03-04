package ar.edu.unlp.objetos.uno.figurasYCuerpos;

public class Circulo implements Figura {
	private double radio;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro() {
		return radio * 2;
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
	
	public double getArea() {
		return Math.PI * radio * radio;
	}
	

}
