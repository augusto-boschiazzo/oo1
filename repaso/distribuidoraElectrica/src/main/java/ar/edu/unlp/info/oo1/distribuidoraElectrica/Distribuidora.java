package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import java.util.LinkedList;
import java.util.List;

public class Distribuidora {
	private List<Usuario> usuarios;
	private double precioKWh;
	
	public Distribuidora(double precioKWh) {
		this.precioKWh = precioKWh;
		usuarios = new LinkedList<Usuario>();
	}
	
	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public List<Factura> facturar() {
		if (!usuarios.isEmpty()) {
			List<Factura> facturas = new LinkedList<Factura>();
			usuarios.stream().forEach(u -> facturas.add(u.facturarEnBaseA(precioKWh)));
			return facturas;
		}
		return null;
	}
	
	public double consumoTotalActiva() {
		return usuarios.stream().mapToDouble(u -> u.getUltimoConsumoActiva()).sum();
	}
	
	public double getPrecioKWh() {
		return precioKWh;
	}
	

}
