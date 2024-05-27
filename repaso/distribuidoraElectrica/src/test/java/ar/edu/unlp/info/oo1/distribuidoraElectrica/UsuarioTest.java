package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	private Usuario usuario;
	private Consumo consumo;
	
	@BeforeEach
	public void setUp() {
		usuario = new Usuario("Cami", "Calle 67");
		consumo = new Consumo(3, 2);
		usuario.agregarMedicion(consumo);

	}
	
	@Test
	public void testUltimoConsumo() {
		assertEquals(usuario.getUltimoConsumo(), consumo);
	}
	
	@Test
	public void testUltimoConsumoActiva() {
		assertEquals(usuario.getUltimoConsumoActiva(), 3);
	}
	
	public void testFacturarEnBaseA() {
		double resultadoEsperado = 3 * 4 - ((3 * 4) / 10);
		assertEquals(usuario.facturarEnBaseA(4).montoTotal(), resultadoEsperado);
	}
	
	
	

}
