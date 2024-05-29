package ar.edu.unlp.info.oo1.cuentaConGanchos;

public abstract class Cuenta {
	private double saldo;
	
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double monto) {
		saldo += monto;
	}
	
	protected void extraerSinControlar(double monto) {
		saldo -= monto;
	}
	
	public boolean extraer(double monto) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
	}
	
	public boolean transferirACuenta(double monto, Cuenta destino) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			destino.depositar(monto);
			return true;
		}
		return false;
	}
	
	protected abstract boolean puedeExtraer(double monto);
	

}
