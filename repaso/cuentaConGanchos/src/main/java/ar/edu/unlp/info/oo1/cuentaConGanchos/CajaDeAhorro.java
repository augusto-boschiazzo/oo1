package ar.edu.unlp.info.oo1.cuentaConGanchos;

public class CajaDeAhorro extends Cuenta {
	
	public CajaDeAhorro(double monto) {
		super(monto);
	}
	
	public boolean extraer(double monto) {
		return super.extraer(this.montoMasPorcentaje(monto));
	}
	
	public boolean transferirACuenta(double monto, Cuenta destino) {
		return super.transferirACuenta(this.montoMasPorcentaje(monto), destino);
	}
	
	public void depositar(double monto) {
		super.depositar(montoMenosPorcentaje(monto));
	}
	
	protected boolean puedeExtraer(double monto) {
		return this.getSaldo() - montoMasPorcentaje(monto) > 0;
	}
	
	private double montoMasPorcentaje(double monto) {
		return monto + monto * 0.02;
	}
	
	private double montoMenosPorcentaje(double monto) {
		return monto - monto * 0.02;
	}
	

}
