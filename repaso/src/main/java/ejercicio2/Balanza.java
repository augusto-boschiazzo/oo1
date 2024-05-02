package ejercicio2;

import java.util.LinkedList;
import java.util.List;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> productos;
	
	public Balanza() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
		this.productos = new LinkedList<Producto>();
	}
	
	public void ponerEnCero() {
		cantidadDeProductos = 0;
		precioTotal = 0;
		pesoTotal = 0;
		productos.clear();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
		precioTotal += producto.getPrecio();
		pesoTotal+= producto.getPeso();
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(productos.size(), pesoTotal, precioTotal);
		return ticket;
	}
	

}
