package ar.edu.unlp.info.oo1.genealogia;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate nacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}
	
	public Mamifero() {
		
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getNacimiento() {
		return nacimiento;
	}
	
	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloPaterno() {
		if (padre != null)
			return padre.getPadre();
		return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (padre != null)
			return padre.getMadre();
		return null;
	}
	
	public Mamifero getAbueloMaterno() {
		if (madre != null)
			return madre.getPadre();
		return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (madre != null)
			return madre.getMadre();
		return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero otro) {
		boolean aux = false;
		if (this.padre != null) {
			aux = this.padre == otro;
			if (!aux)
				aux = padre.tieneComoAncestroA(otro);
		}
		if (!aux) {
			if (this.madre != null) {
				aux = this.madre == otro;
				if (!aux) {
					aux = madre.tieneComoAncestroA(otro);
				}
			}
		}
		return aux;
	}
	

}
