package ar.edu.unlp.info.oo1.inversiones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class InversorTest {
	
	Inversor augus;
	InversionEnAcciones acciones;
	PlazoFijo plazo;
	
	@BeforeEach
	void setUp() throws Exception {
		augus = new Inversor("Augus");
		acciones = new InversionEnAcciones("Apple", 1300, 100);
		plazo = new PlazoFijo(LocalDate.now().minus(10, ChronoUnit.DAYS), 100, 10);
		augus.agregarInversion(acciones);
		augus.agregarInversion(plazo);
	}
	
	@Test
	public void testValorActualAccion() {
		assertEquals(acciones.valorActual(), 130000);
	}
	
	@Test
	public void testValorActualPlazo() {
		assertEquals(plazo.valorActual(), 200);
	}
	
	@Test
	public void testValorActual() {
		assertEquals(augus.valorActual(), 130200);
	}

}
