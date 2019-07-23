package com.ibm.pkmn;

public class PokemonFactory {
 
 public Charmander crearCharmander() {
	
	Charmander charmy= new Charmander();
	charmy.setNombre("Charmander");
	charmy.setTipo("Fuego");
	charmy.setEnergia(100);
	charmy.setHabilidad("Bola de fuego");
	return charmy; 
	 
 }

 public Caterpy crearCaterpy() {
	
	 Caterpy caty= new Caterpy();
	 caty.setNombre("Caterpy");
		caty.setTipo("Hoja");
		caty.setEnergia(100);
		caty.setHabilidad("Corte de hoja");
	 return caty;
	 
	 
 }

  public Squartle crearSquartle() {
	
	  Squartle squar = new Squartle();
	  return squar;
	  
	  
  }
  

    
}