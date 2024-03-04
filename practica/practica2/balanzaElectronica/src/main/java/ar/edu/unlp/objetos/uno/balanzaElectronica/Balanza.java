package ar.edu.unlp.objetos.uno.balanzaElectronica;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private List<Producto> productos = new ArrayList<Producto>();
	
	public void ponerEnCero() {
		productos.clear();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public List<Producto> getProductos() {
		return productos;
	}
	
	public int getCant() {
		return productos.size();
	}
	
	public double getPesoTotal() {
		return productos.stream().mapToDouble(p -> p.getPeso()).sum();
	}
	
	public double getPrecioTotal() {
		return productos.stream().mapToDouble(p -> p.getPrecio()).sum();
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.getCant(), this.getPesoTotal(), this.getPrecioTotal(), productos);
	}

	@Override
	public String toString() {
		return "Balanza [productos=" + productos + "]";
	}
	
	
}
