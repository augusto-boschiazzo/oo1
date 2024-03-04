package ar.edu.unlp.info.oo1.cuentasBancarias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaTest {
	CajaDeAhorro caja;
	CuentaCorriente cuenta;
	
	@BeforeEach
	void setUp() throws Exception{
		caja = new CajaDeAhorro();
		cuenta = new CuentaCorriente();
		
		caja.depositar(1000);
	}
	
	@Test
	public void testTransferirDistintas() {
		assert(caja.transferirACuenta(500, cuenta));
		assertEquals(caja.getSaldo(), 980 - (500 + (500 * 0.02)));
		assert(cuenta.transferirACuenta(250, caja));
		assertEquals(cuenta.getSaldo(), 250);
		assertEquals(caja.getSaldo(), (470 + 250 - (250 * 0.02)));
	}
	
	@Test
	public void testDescubierto() {
		cuenta.setDescubierto(200);
		assert(cuenta.transferirACuenta(450, caja));
	}
	

}
