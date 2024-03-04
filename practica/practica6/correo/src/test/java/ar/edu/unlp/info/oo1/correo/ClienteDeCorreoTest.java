package ar.edu.unlp.info.oo1.correo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDeCorreoTest {
	
	ClienteDeCorreo cliente;
	
	@BeforeEach
	void setUp() throws Exception {
		cliente = new ClienteDeCorreo();
	}
	
	@Test
	public void testInbox() {
		assertEquals(cliente.getCarpetas().get(0).getNombre(), "Inbox");
	}
	
	@Test
	public void testNuevaCarpeta() {
		Carpeta carpeta = new Carpeta("Nueva");
		cliente.crearCarpeta(carpeta);
		assertEquals(cliente.getCarpetas().get(1).getNombre(), "Nueva");
	}
	
	@Test
	public void testBuscar() {
		Email email = new Email("Titulo", "Cuerpo");
		cliente.recibir(email);
		assertSame(cliente.buscar("Titulo"), email);
	}
	
	@Test 
	public void testMover() {
		Carpeta carpeta = new Carpeta("Nueva");
		cliente.crearCarpeta(carpeta);
		
		Email email = new Email("Titulo", "Cuerpo");
		cliente.recibir(email);
		
		cliente.mover(email, cliente.inbox(), carpeta);
		assertTrue(cliente.getCarpetas().get(1).emails().contains(email));
	}
	
	@Test
	public void testEspacioOcupado() {
		Archivo archivo = new Archivo("Archivo");
		
		Email email = new Email("Titulo", "Cuerpo");
		email.adjuntos().add(archivo);
		
		cliente.recibir(email);
		cliente.recibir(email);
		assertEquals(cliente.espacioOcupado(), email.tamaño() * 2);
	}
	

}
