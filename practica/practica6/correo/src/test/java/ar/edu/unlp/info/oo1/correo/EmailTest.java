package ar.edu.unlp.info.oo1.correo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EmailTest {
	
	Email email;
	
	@BeforeEach
	void setUp() throws Exception {
		email = new Email("Nuevo email", "Cuerpo");
	}
	
	@Test
	public void testAgregarArchivo() {
		Archivo archivo = new Archivo("Archivo");
		email.adjuntos().add(archivo);
		assertSame(email.adjuntos().get(0), archivo);
	}
	
	@Test
	public void testTamaño() {
		Archivo archivo = new Archivo("Nombre");
		email.adjuntos().add(archivo);
		email.adjuntos().add(archivo);
		assertEquals(email.tamaño(), email.getCuerpo().length() + email.getTitulo().length() + archivo.tamaño() * 2);
	}
	
	
}
