package ar.edu.unlp.info.oo1.correo;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
	
	Carpeta carpeta;
	
	@BeforeEach
	void setUp() throws Exception {
		carpeta = new Carpeta("Inbox");
	}
	
	@Test
	public void testAgregarMail() {
		Email email = new Email("Titulo", "Cuerpo");
		carpeta.agregarMail(email);
		assertSame(carpeta.emails().get(0), email);
	}
	
	
}
