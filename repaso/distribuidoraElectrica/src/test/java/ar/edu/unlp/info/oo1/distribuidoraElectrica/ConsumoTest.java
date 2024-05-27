package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ConsumoTest {
	private Consumo consumo;
	
	@BeforeEach
	public void setUp() {
		consumo = new Consumo(3, 2);
	}
	
	@Test
	public void testCostoEnBaseA() {
		assertEquals(consumo.costoEnBaseA(4), 12);
	}
	
	@Test
	public void testFactorDePotencia() {
		assertEquals(consumo.factorDePotencia(), 0.8320502943378437);
	}
	
	@Test
	public void testFecha() {
		assertEquals(consumo.getFecha(), LocalDate.now());
	}
	

}
