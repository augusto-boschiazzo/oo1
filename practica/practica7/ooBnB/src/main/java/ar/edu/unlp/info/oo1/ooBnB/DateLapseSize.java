package ar.edu.unlp.info.oo1.ooBnB;

import java.time.LocalDate;

public class DateLapseSize extends DateLapse{
	private int sizeInDays;
	
	public DateLapseSize(LocalDate from, int sizeInDays) {
		super(from);
		this.sizeInDays = sizeInDays;
	}
	
	public LocalDate getTo() {
		return this.getFrom().plusDays(sizeInDays);
	}
	
	public int sizeInDays() {
		return sizeInDays;
	}
	
	public boolean includesDate(LocalDate other) {
		return this.getFrom().isBefore(other) && this.getTo().isAfter(other);
	}
	
	public void addDaysUntil(LocalDate other) {
		DateLapseTo aux = new DateLapseTo(this.getTo(), other);
		this.sizeInDays += aux.sizeInDays();
	}
	

}
