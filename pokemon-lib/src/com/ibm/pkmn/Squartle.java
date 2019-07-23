package com.ibm.pkmn;

public class Squartle {

	 private String nombre;
	 private int energia;
	 private String tipo;
	 private String habilidad;
	 
	public Squartle(String nombre, int energia, String tipo, String habilidad) {
		super();
		this.nombre = nombre;
		this.energia = energia;
		this.tipo = tipo;
		this.habilidad = habilidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	 
	 
}
