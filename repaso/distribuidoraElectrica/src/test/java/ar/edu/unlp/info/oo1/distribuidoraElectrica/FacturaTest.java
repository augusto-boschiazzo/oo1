package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacturaTest {
	private Factura factura;
	
	@BeforeEach
	public void setUp() {
		Consumo consumo = new Consumo(3, 2);
		Usuario usuario = new Usuario("Augus", "Calle 12");
		usuario.agregarMedicion(consumo);
		
		factura = new Factura(usuario, 10.0);
	}
	
	@Test
	public void testDescuento() {
		assertEquals(factura.descuento(), true);
	}
	
	@Test
	public void testMontoTotal() {
		double resultadoEsperado = (10.0 * 3.0 - (10.0 * 3.0 / 10.0));
		assertEquals(factura.montoTotal(), resultadoEsperado);
	}
	
	@Test
	public void testFecha() {
		assertEquals(factura.getFecha(), LocalDate.now());
	}
	

}
