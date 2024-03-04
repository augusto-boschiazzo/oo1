package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
	private double precioKWh;
	private List<Usuario> usuarios;
	
	public Distribuidora(double precio) {
		this.precioKWh = precio;
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public List<Factura> facturar() {
		List<Factura> facturas = new ArrayList<Factura>();
		for(Usuario usuario: usuarios) {
			facturas.add(usuario.facturarEnBaseA(precioKWh));
		}
		return facturas;
	}
	
	public double consumoTotalActiva() {
		return usuarios.stream().mapToDouble(u -> u.ultimoConsumoActiva()).sum();
	}
	
	public void precioKWh(double precio) {
		this.precioKWh = precio;
	}
	
	public double getPrecio() {
		return this.precioKWh;
	}
	
	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

		
}
