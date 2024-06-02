package ar.edu.unlp.info.oo1.inversiones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InversionEnAccionesTest {
	private InversionEnAcciones inv;
	private InversionEnAcciones inv0;
	
	@BeforeEach
	public void setUp() {
		inv = new InversionEnAcciones("Inversion", 100, 10);
		inv0 = new InversionEnAcciones("Inversion", 100, 0);
	}
	
	@Test
	public void testValorActual() {
		assertEquals(inv.valorActual(), 1000);
		assertEquals(inv0.valorActual(), 0);
	}
	

}
