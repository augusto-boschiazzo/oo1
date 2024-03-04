package ar.edu.unlp.info.oo1.correo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ArchivoTest {
	
	Archivo archivo;
	
	@BeforeEach
	void setUp() throws Exception {
		archivo = new Archivo("Nombre");
	}
	
	@Test
	public void testTamaño() {
		assertEquals(archivo.tamaño(), 6);
	}
	

}
