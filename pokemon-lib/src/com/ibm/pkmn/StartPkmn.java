package com.ibm.pkmn;

import java.util.Scanner;

public class StartPkmn {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int pok;
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
			System.out.println("Nombre: "+ ((Charmander)pkn).getNombre()+"; energia: "+((Charmander)pkn).getEnergia());

		} else if (pok==2) {
			
			System.out.println("opcion 2");
			
		}else if(pok==3){
			
			System.out.println("opcion 3");
		}else {
			
			System.out.println("Opcion incorrecta");
		}
		
		pkn.ataqueRealizado();
		
		
			
			 
			 
			 
		 
		
		
	}

}
