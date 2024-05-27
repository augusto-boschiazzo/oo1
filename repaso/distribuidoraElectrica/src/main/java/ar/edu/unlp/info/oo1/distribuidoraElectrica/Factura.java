package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import java.time.LocalDate;

public class Factura {
	private Usuario usuario;
	private double precioKWh;
	private Consumo consumo;
	
	public Factura(Usuario usuario, double precioKWh) {
		this.usuario = usuario;
		this.precioKWh = precioKWh;
		this.consumo = usuario.getUltimoConsumo();
	}
	
	public double montoTotal() {
		double aux = consumo.costoEnBaseA(precioKWh);
		if (descuento())
			aux -= (aux / 10);
		return aux;
	}
	
	public boolean descuento() {
		return consumo.factorDePotencia() > 0.8;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public LocalDate getFecha() {
		return consumo.getFecha();
	}
	

}
