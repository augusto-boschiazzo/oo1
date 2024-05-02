package ejercicio3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public double costo() {
		return cantidad * costoUnitario;
	}
	

}
