package ar.edu.unlp.info.oo1.cuentasBancarias;

public class CuentaCorriente extends Cuenta {
	double descubierto;
	
	public CuentaCorriente() {
		super();
		this.descubierto = 0;
	}
	
	protected boolean puedeExtraer(double monto) {
		if (this.getSaldo() + this.descubierto >= 0) {
			return true;
		}
		return false;
	}
	
	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	public double getDescubierto() {
		return descubierto;
	}
	
	
}
