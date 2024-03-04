package ar.edu.unlp.info.oo1.reporteConstruccion;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPieza(Pieza pieza) {
		piezas.add(pieza);
	}
	
	public double getVolumenDeMaterial(String material) {
		/**double total = 0;
		for (Pieza p: piezas) {
			if (p.getMaterial().equals(material)) {
				total += p.calcularVolumen();
			}
		}
		return total;
		**/
		return piezas.stream().filter(p -> p.getMaterial().equals(material)).mapToDouble(t -> t.calcularVolumen()).sum();
	}
	
	public double getSuperficieDeColor(String color) {
		double total = 0;
		for (Pieza p: piezas) {
			if (p.getColor().equals(color)) {
				total += p.calcularSuperficie();
			}
		}
		return total;
	}
	
	
}
