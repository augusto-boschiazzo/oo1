package ar.edu.unlp.info.oo1.inversiones;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fecha, double monto, double porcentaje) {
		this.fechaDeConstitucion = fecha;
		this.montoDepositado = monto;
		this.porcentajeDeInteresDiario = porcentaje;
	}
	
	public double calcularPorcentaje() {
		return montoDepositado * porcentajeDeInteresDiario / 100.0;
	}	
	
	public double valorActual() {
		return montoDepositado + this.calcularPorcentaje() * fechaDeConstitucion.until(LocalDate.now(), ChronoUnit.DAYS);
	}
	
	public String toString() {
		return "Fecha de constitucion: " + this.fechaDeConstitucion + " Valor actual: " + this.valorActual();
	}
}
