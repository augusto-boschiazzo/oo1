package ar.edu.unlp.objetos.uno.figurasYCuerpos;

public class Cuerpo {
	public double altura;
	public Figura caraBasal;
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getSuperficie() {
		return 2 * caraBasal.getArea() + caraBasal.getPerimetro() * altura;
	}
	
	public double getVolumen() {
		return caraBasal.getArea() * altura;
	}
	

}
