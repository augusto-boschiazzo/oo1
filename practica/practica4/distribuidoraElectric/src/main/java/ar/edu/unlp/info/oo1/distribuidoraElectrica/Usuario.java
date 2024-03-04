package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Usuario {
	private String nombre;
	private String domicilio;
	private List<Factura> facturas;
	private List<Consumo> consumos;
	
	public Usuario(String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.facturas = new ArrayList<Factura>();
		this.consumos = new ArrayList<Consumo>();
	}
	
	public void agregarMedicion(Consumo medicion) {
		consumos.add(medicion);
	}
	
	public double ultimoConsumoActiva() {
		return consumos.get(this.consumos.size() -1).getActiva();
	}
	
	public double ultimoFpe() {
		return consumos.get(this.consumos.size() -1).factorDePotencia();
	}
	
	public Factura facturarEnBaseA(double precioKWh) {
		Factura factura = new Factura(this.ultimoConsumoActiva() * precioKWh, LocalDate.now(), this);
		facturas.add(factura);
		return factura;
	}
	
	public List<Factura> facturas() {
		return this.facturas;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	

}
