package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto("Fregadero", 189.90);
		System.out.println("Nombre: " + producto1.getNombre());
		System.out.println("Precio: " + producto1.getPrecio());

		producto1.setPrecio(-100);
		System.out.println("Precio corregido: " + producto1.getPrecio());
		System.out.println("Precio promo 20%: " + producto1.calcularPrecioPromo(20));
	}
}