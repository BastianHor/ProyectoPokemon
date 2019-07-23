package com.ibm.pkmn;

import java.util.Scanner;

public class StartPkmn {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int pok;
		int pelea;
		int atac;
		System.out.println("M E N U");
		System.out.println("---------------");
		System.out.println("1.Charmander");
		System.out.println("2.Squartler");
		System.out.println("3.Carterpy");
		System.out.println("Elige tu Pokemon");
		pok=sc.nextInt();
		PokemonFactory pokefact = new PokemonFactory();
		Pokemon pkn= null;
		if(pok==1) {
			
			//System.out.println("opcion 1");
			pkn = pokefact.crearCharmander();
			((Charmander)pkn).getNombre();
			System.out.println("Nombre: "+ ((Charmander)pkn).getNombre()+"; energia: "+
			((Charmander)pkn).getEnergia()+ "; Tipo: "+ ((Charmander)pkn).getTipo()+ "; Habilidad: "+
			((Charmander)pkn).getHabilidad());
			
			System.out.println("----------------------------------------------");
			System.out.println("inicio de batalla");
			System.out.println("Elija su oponente");
			System.out.println("2.Squartler");
			System.out.println("3.Carterpy");
			pelea=sc.nextInt();
			if (pelea==2) {
				System.out.println("Has escogido pelear contra Squartle");
				System.out.println("1.ataque");
				atac=sc.nextInt();
				if(atac==1) {
					int energy=100;
					int resultado;
					resultado = energy-50; 
					System.out.println("Energia de Squartle: "+resultado);
										
					//System.out.println("Energia: "+);
				
				}
				
			}
						
			
		} else if (pok==2) {
			
			//System.out.println("opcion 2");
			pkn = pokefact.crearSquartle();
			((Squartle)pkn).getNombre();
			System.out.println("Nombre: "+ ((Squartle)pkn).getNombre()+"; energia: "+
			((Squartle)pkn).getEnergia()+ "; Tipo: "+ ((Squartle)pkn).getTipo()+ "; Habilidad: "+
			((Squartle)pkn).getHabilidad());
			
			
		}else if(pok==3){
			
			//System.out.println("opcion 3");
			
			pkn = pokefact.crearCaterpy();
			((Caterpy)pkn).getNombre();
			System.out.println("Nombre: "+ ((Caterpy)pkn).getNombre()+"; energia: "+
			((Caterpy)pkn).getEnergia()+ "; Tipo: "+ ((Caterpy)pkn).getTipo()+ "; Habilidad: "+
			((Caterpy)pkn).getHabilidad());
			
			
		}else {
			
			System.out.println("Opcion incorrecta");
		}
		
		pkn.ataqueRealizado();
		
		
			
			 
			 
			 
		 
		
		
	}

}
