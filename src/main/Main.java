package main;

import dresseurs.Dresseur;
import pokemons.Pokemon0;
import pokemons.PokemonEau;
import pokemons.PokemonFeu;
import pokemons.PokemonPlante;

public class Main {
	
	public static void main(String [] args)
	{
		System.out.println("\n TESTS 0 \n");
		testPokemon0();
		System.out.println("\n TEST TYPES \n");
		testPokemonTypes();
		System.out.println("\n TEST DRESSEUR \n");
		testDresseur();
		
	}
	
	private static void testPokemon0(){
		Pokemon0 p1 = new Pokemon0("Rhinolove");
		Pokemon0 p2 = new Pokemon0("Chovsourir");
		
		p1.log(p1.toString());
		p2.log(p2.toString());
		p1.attaquer(p2);
		p2.log(p2.toString());
	}
	
	private static void testPokemonTypes()
	{
		PokemonFeu pfeu = new PokemonFeu("Dracaufeu");
		PokemonEau peau = new PokemonEau("Tortank");
		PokemonPlante pplant = new PokemonPlante("Florizarre");
	
		pfeu.log(pfeu.toString());
		peau.log(peau.toString());
		pplant.log(pplant.toString());
		
		pfeu.attaquer(pplant);
		pplant.log(pplant.toString());
		
		pplant.attaquer(pfeu);
		pfeu.log(pfeu.toString());
		
		peau.attaquer(pfeu);
		pfeu.log(pfeu.toString());
	}
	
	private static void testDresseur()
	{
		Dresseur dresseur = new Dresseur("Sacha", 10);
		dresseur.capturerPokemons();
		
		Dresseur dresseur2 = new Dresseur("Regis", 10);
		dresseur2.capturerPokemons();
		
		dresseur.combattre(dresseur2);
	}

}
