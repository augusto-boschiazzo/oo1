package ar.edu.unlp.objetos.uno.genealogia;

import java.util.Date;

public class Mamifero {
	private String identificador;
	private String especie;
	private Date fecha;
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
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
	
	public boolean tieneComoAncestroA(Mamifero mamifero) {
		boolean aux = false;
		if ((this.getPadre() == mamifero) || (this.getMadre() == mamifero)) {
			aux = true;
		}
		if (!aux && this.getPadre() != null) {
			aux = this.padre.tieneComoAncestroA(mamifero);
		}
		if (!aux && this.getMadre() != null) {
			aux = this.madre.tieneComoAncestroA(mamifero);
		}
		return aux;
	}
	

}
