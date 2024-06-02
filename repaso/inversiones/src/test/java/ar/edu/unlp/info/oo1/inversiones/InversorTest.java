package ar.edu.unlp.info.oo1.inversiones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class InversorTest {
	private Inversor inversor;
	private PlazoFijo plazo;
	private InversionEnAcciones inv;
	
	@BeforeEach
	public void setUp() {
		inversor = new Inversor("Augus");
		
		plazo = new PlazoFijo(LocalDate.of(2024, 5, 30), 100.0, 10.0);
		inv = new InversionEnAcciones("Inversion", 100, 10);

		inversor.agregarInversion(plazo);
		inversor.agregarInversion(inv);
	}
	
	@Test
	public void testValorActual() {
		assertEquals(inversor.valorActual(), 1120);
	}
	
	
	

}
