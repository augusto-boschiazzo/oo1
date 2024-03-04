package ar.edu.unlp.info.oo1.fechas;

import java.time.LocalDate;

public abstract class DateLapse {
	private LocalDate from;
	
	public DateLapse(LocalDate from) {
		this.from = from;
	}
	
	public LocalDate getFrom() {
		return from;
	}
	
	public abstract LocalDate getTo();
	
	public abstract int sizeInDays();
	
	public abstract boolean includesDate(LocalDate other);
}
