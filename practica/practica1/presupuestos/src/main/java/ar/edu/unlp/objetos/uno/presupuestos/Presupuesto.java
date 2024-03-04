package ar.edu.unlp.objetos.uno.presupuestos;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String cliente) {
		fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new ArrayList<Item>();
	}

	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		int total = 0;
		for (Item item: this.items) {
			total += item.costo();
		}
		//this.items.forEach(t -> total += t.costo());
		return total;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getCliente() {
		return cliente;
	}

	@Override
	public String toString() {
		return "Presupuesto [fecha=" + fecha + ", cliente=" + cliente + ", items=" + items + "]";
	}
	

}
