package ar.edu.unlp.info.oo1.fechas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapseFrom extends DateLapse{
	private LocalDate to;
	
	public DateLapseFrom(LocalDate from, LocalDate to) {
		super(from);
		this.to = to;
	}
	
	public LocalDate getTo() {
		return to;
	}
	
	public int sizeInDays() {
		return Long.valueOf(this.getFrom().until(to, ChronoUnit.DAYS)).intValue();
	}
	
	public boolean includesDate(LocalDate other) {
		return this.getFrom().isBefore(other) && this.to.isAfter(other);
	}
	

}
