package ar.edu.unlp.objetos.uno.presupuestos;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String detalle, int cantidad, double costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}

	public double costo() {
		return cantidad * this.getCostoUnitario();
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	@Override
	public String toString() {
		return "Item [detalle=" + detalle + ", cantidad=" + cantidad + ", costoUnitario=" + costoUnitario + "]";
	}
	
	
}
