package ar.edu.unlp.info.oo1.finalFebrero;

public class Sistema {
	
	public static void main(String args[]) {
		Producto servicio = new Servicio(5, 100, "Configurar la red Wi-Fi");
		Producto articulo = new Articulo(500, 3, 1, "Martillo");
		
		Pedido pedido = new Pedido();
		pedido.agregarProducto(servicio);
		pedido.agregarProducto(articulo);
		
		System.out.println(pedido.costoTotal());
	}
	

}
