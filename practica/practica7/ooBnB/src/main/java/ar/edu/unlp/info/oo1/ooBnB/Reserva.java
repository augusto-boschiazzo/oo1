package ar.edu.unlp.info.oo1.ooBnB;

public class Reserva {
	private DateLapse periodo;
	private Propiedad propiedad;
	
	public Reserva(DateLapse periodo, Propiedad propiedad) {
		this.periodo = periodo;
		this.propiedad = propiedad;
	}
	
	public DateLapse getPeriodo() {
		return periodo;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public double calcularPrecio() {
		return periodo.sizeInDays() * propiedad.getPrecio();
	}
	
	public boolean estaReservado(DateLapse periodo, Propiedad propiedad) {
		return this.propiedad == propiedad && this.periodo.overlaps(periodo);
	}

}
