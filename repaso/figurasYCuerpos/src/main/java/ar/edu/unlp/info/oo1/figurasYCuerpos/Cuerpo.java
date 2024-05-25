package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuerpo {
	private Figura caraBasal;
	private double altura;
	
	public Cuerpo() {
		
	}
	
	public Cuerpo(Figura caraBasal, double altura) {
		this.caraBasal = caraBasal;
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double valor) {
		altura = valor;
	}
	
	public void setCaraBasal(Figura cara) {
		caraBasal = cara;
	}
	
	public double getVolumen() {
		return caraBasal.getArea() * altura;
	}
	
	public double getSuperficie() {
		return 2 * caraBasal.getArea() + caraBasal.getPerimetro() * altura;
	}
	

}
