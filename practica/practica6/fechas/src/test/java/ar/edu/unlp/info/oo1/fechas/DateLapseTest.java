package ar.edu.unlp.info.oo1.fechas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DateLapseTest {
	
	DateLapseFrom dateLapseTo;
	DateLapseSize dateLapseSize;
	
	@BeforeEach
	void setUp() throws Exception {
		dateLapseTo = new DateLapseFrom(LocalDate.of(2002, 8, 26), LocalDate.of(2004, 06, 20));
		dateLapseSize = new DateLapseSize(LocalDate.of(2002, 8, 26), 365);
	}
	
	@Test
	public void testSizeInDays() {
		assertEquals(dateLapseTo.sizeInDays(), 664);
	}
	
	@Test
	public void testGetTo() {
		assertEquals(dateLapseSize.getTo(), LocalDate.of(2003, 8, 26));
	}
	
	@Test
	public void testIncludesDate() {
		LocalDate other = LocalDate.of(2003, 12, 9);
		assertTrue(dateLapseTo.includesDate(other));
		assertFalse(dateLapseTo.includesDate(LocalDate.now()));
		assertFalse(dateLapseSize.includesDate(other));
	}
	

}
