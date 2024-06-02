package ar.edu.unlp.info.oo1.finalFebrero;

import java.util.LinkedList;
import java.util.List;

public class Pedido {
	private List<Producto> productos;
	
	public Pedido() {
		productos = new LinkedList<Producto>();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public double costoTotal() {
		return productos.stream().mapToDouble(p -> p.costo()).sum();
	}
	

}
