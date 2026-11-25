package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	public Item(String nombre) {
		this.nombre = nombre;
	}

	public void imprimir() {
		System.out.println("--- " + nombre + " ---");
		System.out.println("Productos actuales: " + productosActuales);
		System.out.println("Productos vendidos: " + productosVendidos);
		System.out.println("Productos devueltos: " + productosDevueltos);
	}

	public void vender(int cantidad) {
		productosActuales = productosActuales - cantidad;
		productosVendidos = productosVendidos + cantidad;
	}

	public void devolver(int cantidad) {
		productosActuales = productosActuales + cantidad;
		productosVendidos = productosVendidos - cantidad;
		productosDevueltos = productosDevueltos + cantidad;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public String getNombre() {
		return nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}
}