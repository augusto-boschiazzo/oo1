package ar.edu.unlp.info.oo1.correo;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.emails = new ArrayList<Email>();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public List<Email> emails() {
		return emails;
	}
	
	public void agregarMail(Email email) {
		this.emails().add(email);
	}
	
	
}
