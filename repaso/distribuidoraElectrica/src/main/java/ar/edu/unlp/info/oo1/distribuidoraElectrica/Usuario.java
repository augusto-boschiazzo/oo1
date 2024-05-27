package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private LinkedList<Consumo> consumos;
	private List<Factura> facturas;
	
	public Usuario(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		consumos = new LinkedList<Consumo>();
		facturas = new LinkedList<Factura>();
	}
	
	public void agregarMedicion(Consumo medicion) {
		consumos.add(medicion);
	}
	
	public Consumo getUltimoConsumo() {
		return consumos.getLast();
	}
	
	public double getUltimoConsumoActiva() {
		return this.getUltimoConsumo().getActiva();
	}
	
	public List<Factura> getFacturas() {
		return facturas;
	}
	
	public Factura facturarEnBaseA(double precioKWh) {
		Factura factura = new Factura(this, precioKWh);
		facturas.add(factura);
		return factura;
	}
	
	public String toString() {
		String aux = "Nombre: " + nombre + ", Direccion: " + direccion;
		return aux;
	}
	

}
