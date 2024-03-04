package ar.edu.unlp.info.oo1.ooBnB;

import java.util.ArrayList;
import java.util.List;

public class OOBnB {
	private List<Usuario> usuarios;
	private List<Propiedad> propiedades;
	private List<Reserva> reservas;
	
	public Usuario registrarUsuario(String nombre, String direccion, String dni) {
		Usuario usuario = new Usuario(nombre, direccion, dni);
		usuarios.add(usuario);
		return usuario;
	}
	
	public Propiedad registrarPropiedad(String nombre, String direccion, String descripcion, double precio, Usuario usuario) {
		Propiedad propiedad = new Propiedad(nombre, direccion, descripcion, precio, usuario);
		return propiedad;
	}
	
	public void hacerReserva(DateLapse periodo, Propiedad propiedad, Usuario usuario) {
		Reserva reserva = new Reserva(periodo, propiedad);
		usuario.agregarReserva(reserva);
		reserva.getPropiedad().getPropietario().agregarAlquiler(reserva);
		reservas.add(reserva);
	}
	
	public List<Propiedad> buscarPropiedadesDisponibles(DateLapse periodo) {
		List<Propiedad> aux = new ArrayList<Propiedad>();
		for (Propiedad p: propiedades) {
			reservas.stream().filter(r -> r.estaReservado(periodo, p)).forEach(i -> aux.add(p));;
		}
		return aux;
	}

}
