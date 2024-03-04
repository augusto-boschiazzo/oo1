package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import java.time.LocalDate;

public class Consumo {
	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;

	public Consumo(LocalDate fecha, double consumoAc, double consumoReac) {
		this.fecha = fecha;
		this.consumoEnergiaActiva = consumoAc;
		this.consumoEnergiaReactiva = consumoReac;
	}
	
	public double costoEnBaseA(double precioKWh) {
		return consumoEnergiaActiva * precioKWh;
	}
	
	public double factorDePotencia() {
		return consumoEnergiaActiva / (Math.sqrt(consumoEnergiaActiva * consumoEnergiaActiva + consumoEnergiaReactiva * consumoEnergiaReactiva));
	}
	
	public double getActiva() {
		return this.consumoEnergiaActiva;
	}

}
