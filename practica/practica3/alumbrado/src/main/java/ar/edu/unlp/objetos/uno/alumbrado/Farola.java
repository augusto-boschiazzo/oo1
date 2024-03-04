package ar.edu.unlp.objetos.uno.alumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean encendida;
	private List<Farola> vecinas;
	
	public Farola() {
		this.encendida = false;
		this.vecinas = new ArrayList<Farola>();
	}
	
	public boolean isOn() {
		return this.encendida;
	}
	
	public void toggleEncendida() {
		this.encendida = !this.encendida;
	}
	
	public void pairWithNeighbor(Farola farola) {
		if (!this.vecinas.contains(farola)) {
			this.vecinas.add(farola);
			farola.pairWithNeighbor(this);
		}
	}
	
	public List<Farola> getNeighbors() {
		return this.vecinas;
	}
	
	public void turnOn() {
		if (!this.isOn()) {
			this.toggleEncendida();
		}
		for(Farola farola: this.vecinas) {
			if(!farola.isOn())
				farola.turnOn();
		}
	}
	
	public void turnOff() {
		if (this.isOn()) {
			this.toggleEncendida();
		}
		for(Farola farola: this.vecinas) {
			if(farola.isOn())
				farola.turnOff();
		}
	}
	
	
}
