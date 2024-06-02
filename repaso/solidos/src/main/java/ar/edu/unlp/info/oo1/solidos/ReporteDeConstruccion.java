package ar.edu.unlp.info.oo1.solidos;

import java.util.LinkedList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		piezas = new LinkedList<Pieza>(); 
	}
	
	public double getVolumenDeMaterial(String material) {
		return piezas.stream()
			         .filter(p -> p.getMaterial().equals(material))
			         .mapToDouble(f -> f.getVolumen())
			         .sum();
	}
	
	public double getSuperficieDeColor(String color) {
		return piezas.stream()
				     .filter(p -> p.getColor().equals(color))
				     .mapToDouble(f -> f.getSuperficie())
				     .sum();
	}
	
	
}
