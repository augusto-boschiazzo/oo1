package ar.edu.unlp.info.oo1.reporteConstruccion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteTest {
	
	ReporteDeConstruccion reporte;
	Cilindro cilindro;
	Esfera esfera;
	Prisma prisma;
	
	
	@BeforeEach
	void setUp() throws Exception {
		reporte = new ReporteDeConstruccion();
		
		cilindro = new Cilindro("Hierro", "Rojo", 2, 4);
		esfera = new Esfera("Hierro", "Azul", 3);
		prisma = new Prisma("Aluminio", "Rojo", 3, 2, 6);
		
		reporte.agregarPieza(cilindro);
		reporte.agregarPieza(esfera);
		reporte.agregarPieza(prisma);
	}
	
	@Test
	public void testVolumen() {
		assertEquals(reporte.getVolumenDeMaterial("Hierro"), (cilindro.calcularVolumen() + esfera.calcularVolumen()));
		assertEquals(reporte.getVolumenDeMaterial("Aluminio"), prisma.calcularVolumen());
	}
	
	@Test
	public void testSuperficie() {
		assertEquals(reporte.getSuperficieDeColor("Rojo"), (cilindro.calcularSuperficie() + prisma.calcularSuperficie()));
		assertEquals(reporte.getSuperficieDeColor("Azul"), esfera.calcularSuperficie());
	}

}
