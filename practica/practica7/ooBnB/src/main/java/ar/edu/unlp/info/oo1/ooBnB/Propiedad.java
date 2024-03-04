package ar.edu.unlp.info.oo1.ooBnB;

public class Propiedad {
	private String nombre, direccion, descripcion;
	private double precio;
	private Usuario propietario;
	
	public Propiedad(String nombre, String direccion, String descripcion, Double precio, Usuario propietario) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.descripcion = descripcion;
		this.precio = precio;
		this.propietario = propietario;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public Usuario getPropietario() {
		return propietario;
	}
	

}
