package ar.edu.unlp.info.oo1.inversiones;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	
	public int cantidadDeDiasTranscurridos() {
		return Math.toIntExact(ChronoUnit.DAYS.between(fechaDeConstitucion, LocalDate.now()));
	}
	
	public double montoPorDia() {
		return montoDepositado * porcentajeDeInteresDiario / 100;
	}
	
	public double valorActual() {
		return montoDepositado + (this.montoPorDia() * this.cantidadDeDiasTranscurridos());
	}
	

}
