package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DistribuidoraTest {
	
	Distribuidora distribuidora;
	Usuario juan;
	Consumo juanC;
	Usuario pablo;
	Consumo pabloC;
	
	@BeforeEach
	void setUp() throws Exception {
		distribuidora = new Distribuidora(120);

		juan = new Usuario("Juan Papu", "Calle de los papus");
		
		juanC = new Consumo(LocalDate.now(), 1100, 200);
		juan.agregarMedicion(juanC);
		
		distribuidora.agregarUsuario(juan);
		
		
		pablo = new Usuario("Pablo Petez", "Avenida Siempreviva 123");
		
		pabloC = new Consumo(LocalDate.now(), 400, 15);
		pablo.agregarMedicion(pabloC);
		
		distribuidora.agregarUsuario(pablo);
		
		
	}
	
	@Test
	public void testPrecio() {
		assertEquals(distribuidora.getPrecio(), 120);
	}
	
	@Test
	public void testUsuario() {
		assertEquals(distribuidora.getUsuarios().get(0).getNombre(), "Juan Papu");
		assertEquals(distribuidora.getUsuarios().get(0).getDomicilio(), "Calle de los papus");
	}
	
	@Test
	public void testConsumo() {
		assertEquals(distribuidora.getUsuarios().get(0).ultimoConsumoActiva(), 1100);
	}
	
	@Test
	public void testConsumoFPE() {
		double test = 0.9838699100999074;
		assertEquals(juanC.factorDePotencia(), test);
	}
	
	@Test
	public void testFactura() {
		List<Factura> facturas = distribuidora.facturar();
		assertEquals(facturas.get(0).descuento(), 13200);
		assertEquals(facturas.get(0).usuario(), juan);
		assertEquals(facturas.get(1).usuario(), pablo);
	}
	
	@Test
	public void testConsumoTotal() {
		assertEquals(distribuidora.consumoTotalActiva(), 1500);
	}
		

}
