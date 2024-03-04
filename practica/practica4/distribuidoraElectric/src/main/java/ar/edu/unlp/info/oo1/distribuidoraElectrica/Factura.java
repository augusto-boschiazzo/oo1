package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import java.time.LocalDate;

public class Factura {
	private double montoEnergiaActiva;
	private LocalDate fecha;
	private Usuario usuario;
	
	public Factura(double consumo, LocalDate localDate, Usuario usuario) {
		this.montoEnergiaActiva = consumo;
		this.fecha = localDate;
		this.usuario = usuario;
	}
	
	public double montoTotal() {
		return this.montoEnergiaActiva - this.descuento();
	}
	
	public Usuario usuario() {
		return this.usuario;
	}
	
	public LocalDate fecha() {
		return fecha;
	}
	
	public double descuento() {
		if (this.usuario.ultimoFpe() > 0.8)
			return this.montoEnergiaActiva * 0.1;
		return 0;
	}
	

}
