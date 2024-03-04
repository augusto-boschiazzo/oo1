package ar.edu.unlp.info.oo1.correo;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("Inbox");
		this.carpetas = new ArrayList<Carpeta>();
		this.crearCarpeta(inbox);
	}
	
	public void crearCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	public void recibir(Email email) {
		this.inbox.agregarMail(email);
	}
	
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		origen.emails().remove(email);
		destino.agregarMail(email);
	}
	
	public Email buscar(String texto) {
		for (Carpeta c: carpetas) {
			for (Email e: c.emails()) {
				if (e.getCuerpo() == texto || e.getTitulo() == texto) {
					return e;
				}
			}
		}
		return null;
	}
	
	public int espacioOcupado() {
		return this.carpetas.stream()
				.mapToInt(c -> c.emails().stream()
						.mapToInt(e -> e.tamaño())
						.sum())
				.sum();
	}

	public Carpeta inbox() {
		return inbox;
	}

	public List<Carpeta> getCarpetas() {
		return carpetas;
	}
	

}
