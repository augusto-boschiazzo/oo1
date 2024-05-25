package ar.edu.unlp.info.oo1.alumbrado;

import java.util.LinkedList;
import java.util.List;

public class Farola {
	private boolean interruptor;
	private List<Farola> vecinas;
	
	public Farola() {
		interruptor = false;
		vecinas = new LinkedList<Farola>();
	}
	
	public void conectarFarola(Farola otro) {
		if (!vecinas.contains(otro)) {
			vecinas.add(otro);
			otro.conectarFarola(this);
		}
	}
	
	public void encenderFarola() {
		if (!interruptor) {
			interruptor = true;
			for (Farola f: vecinas) {
				f.encenderFarola();
			}
		}
	}
	
	public void apagarFarola() {
		if (interruptor) {
			interruptor = false;
			for (Farola f: vecinas) {
				f.apagarFarola();
			}
		}
	}
	
	public List<Farola> getVecinas() {
		return vecinas;
	}
	

}
