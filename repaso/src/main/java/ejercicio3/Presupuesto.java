package ejercicio3;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String cliente) {
		super();
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new LinkedList<Item>();
	}

	public void agregarItem(Item item) {
		items.add(item);
	}
	
	public double calcularTotal() {
		return items.stream().mapToDouble(i -> i.costo()).sum();
	}
	

}
