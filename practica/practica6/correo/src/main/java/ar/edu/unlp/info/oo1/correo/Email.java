package ar.edu.unlp.info.oo1.correo;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		 this.adjuntos = new ArrayList<Archivo>();
		 this.titulo = titulo;
		 this.cuerpo = cuerpo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public List<Archivo> adjuntos() {
		return adjuntos;
	}
	
	public int tamaño() {
		int tam = this.adjuntos.stream().mapToInt(a -> a.tamaño()).sum() 
				+ this.getTitulo().length() 
				+ this.getCuerpo().length();
		return tam;
	}
	

}
