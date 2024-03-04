package ar.edu.unlp.info.oo1.cuentasBancarias;

public class CajaDeAhorro extends Cuenta {
	
	protected boolean puedeExtraer(double monto) {
		double montoTotal = monto + this.porcentaje(monto);
		if(this.getSaldo() - (montoTotal) >= 0) {
			return true;
		}
		return false;
	}
	
	public double porcentaje(double monto) {
		return (monto * 0.02);
	}
	
	protected void extraerSinControlar(double monto) {
		double montoTotal = monto + this.porcentaje(monto);
		super.extraerSinControlar(montoTotal);
	}
	
	public void depositar(double monto) {
		double montoTotal = monto - this.porcentaje(monto);
		super.depositar(montoTotal);
	}
	
	
}
