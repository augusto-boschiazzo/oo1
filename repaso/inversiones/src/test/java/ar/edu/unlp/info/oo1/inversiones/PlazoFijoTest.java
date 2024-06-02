package ar.edu.unlp.info.oo1.inversiones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class PlazoFijoTest {
	private PlazoFijo plazo;
	
	@BeforeEach
	public void setUp() {
		plazo = new PlazoFijo(LocalDate.of(2024, 5, 30), 100.0, 10.0);
	}
	
	@Test
	public void testValorActual() {
		assertEquals(plazo.valorActual(), 120);
	}
	

}
