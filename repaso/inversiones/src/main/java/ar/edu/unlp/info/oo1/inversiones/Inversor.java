package ar.edu.unlp.info.oo1.inversiones;

import java.util.LinkedList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		inversiones = new LinkedList<Inversion>();
	}
	
	public double valorActual() {
		return inversiones.stream().mapToDouble(i -> i.valorActual()).sum();
	}
	
	public void agregarInversion(Inversion inversion) {
		inversiones.add(inversion);
	}
	

}
