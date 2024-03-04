package ar.edu.unlp.info.oo1.ooBnB;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapseTo extends DateLapse{
	private LocalDate to;
	
	public DateLapseTo(LocalDate from, LocalDate to) {
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
	
	public void addDaysUntil(LocalDate other) {
		this.to = other;
	}
	

}
