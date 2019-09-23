package com.example.demo;

import java.io.Serializable;

public class Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nombre;
	
	public Item() {
		
	}
	
	public Item(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
