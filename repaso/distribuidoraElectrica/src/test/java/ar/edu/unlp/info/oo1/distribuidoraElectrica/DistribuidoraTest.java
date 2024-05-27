package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DistribuidoraTest {
	private Distribuidora distribuidora;
	
	@BeforeEach
	public void setUp() {
		distribuidora = new Distribuidora(10);
		
		Usuario cami = new Usuario("Cami", "Calle 67");
		Consumo consumoCami = new Consumo(3, 2);
		
		cami.agregarMedicion(consumoCami);
		
		distribuidora.agregarUsuario(cami);
		
		Usuario augus = new Usuario("augus", "Calle 12");
		Consumo consumoAugus = new Consumo(10, 5);
		
		augus.agregarMedicion(consumoAugus);
		
		distribuidora.agregarUsuario(augus);
	}
	
	@Test
	public void testFacturar() {
		List<Factura> facturas = distribuidora.facturar();
		assertEquals(facturas.get(0).montoTotal(), 27);
	}
	
	@Test
	public void testConsumoTotalActiva() {
		assertEquals(distribuidora.consumoTotalActiva(), 13);
	}
	

}
