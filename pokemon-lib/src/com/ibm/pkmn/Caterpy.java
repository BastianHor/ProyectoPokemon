package com.ibm.pkmn;

public class Caterpy implements Pokemon{

	 private String nombre;
	 private int energia;
	 private String tipo;
	 private String habilidad;
	 
	 
	 
	public Caterpy() {
		super();
	}

	public Caterpy(String nombre, int energia, String tipo, String habilidad) {
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

	@Override
	public void ataqueRealizado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void danioRecibido() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
