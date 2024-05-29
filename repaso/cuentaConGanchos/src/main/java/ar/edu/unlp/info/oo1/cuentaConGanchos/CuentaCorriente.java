package ar.edu.unlp.info.oo1.cuentaConGanchos;

public class CuentaCorriente extends Cuenta {
	private double descubierto;
	
	public CuentaCorriente(double monto, double descubierto) {
		super(monto);
		this.descubierto = descubierto;
	}
	
	public double getDescubierto() {
		return descubierto;
	}
	
	protected boolean puedeExtraer(double monto) {
		if ((this.getSaldo() + descubierto) - monto > 0) {
			return true;
		}
		return false;
	}
	

}
