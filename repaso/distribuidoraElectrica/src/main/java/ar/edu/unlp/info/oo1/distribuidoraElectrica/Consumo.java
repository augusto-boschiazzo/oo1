package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import java.time.LocalDate;

public class Consumo {
	private LocalDate fecha;
	private double activa;
	private double reactiva;
	
	public Consumo(double activa, double reactiva) {
		this.activa = activa;
		this.reactiva = reactiva;
		fecha = LocalDate.now();
	}
	
	public double getActiva() {
		return activa;
	}
	
	public double costoEnBaseA(double precioKWh) {
		return activa * precioKWh;
	}
	
	public double factorDePotencia() {
		return activa / Math.sqrt(activa * activa + reactiva * reactiva);
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	

}
