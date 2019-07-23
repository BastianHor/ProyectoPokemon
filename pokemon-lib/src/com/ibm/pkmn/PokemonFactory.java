package factoryPokemon;

public class Pokemon {
 private String nombre;
 private int energia;
 private String tipo;
 public Pokemon() {}
 
 public Pokemon(String nombre, int energia, String tipo) {
	 this.nombre=nombre;
	 this.energia=energia;
	 this.tipo=tipo;
  }
 public String getnombre() {
  	 return nombre;
 }
 public String setnombre() {
	 return this.nombre=nombre;
	 
 }
 public int getEnergia() {
	  return energia;
 }
    
 public void setEnergia(int energia) {
	 this.energia=energia;
 }
 public String getTipo() {
	 return tipo;
 }
 public String setTipo() {
	 return this.tipo=tipo;
 }

  

    
}