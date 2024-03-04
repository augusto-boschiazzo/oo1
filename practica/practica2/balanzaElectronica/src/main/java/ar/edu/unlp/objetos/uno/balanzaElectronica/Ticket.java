package ar.edu.unlp.objetos.uno.balanzaElectronica;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public double impuesto() {
		return this.precioTotal * 21 / 100;
	}
	
	public Ticket(int cant, double peso, double precio, List<Producto> productos) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cant;
		this.pesoTotal = peso;
		this.precioTotal = precio;
		this.precioTotal += this.impuesto();
		this.productos = productos;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	@Override
	public String toString() {
		return "Ticket [fecha=" + fecha + ", cantidadDeProductos=" + cantidadDeProductos + ", pesoTotal=" + pesoTotal
				+ ", precioTotal=" + precioTotal + "]";
	}
	
	
}
