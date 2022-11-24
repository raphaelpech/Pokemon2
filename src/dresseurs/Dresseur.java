package dresseurs;

import java.util.ArrayList;
import java.util.Random;

import pokemons.Pokemon;
import pokemons.PokemonEau;
import pokemons.PokemonFeu;
import pokemons.PokemonPlante;

public class Dresseur {
	
	private Random rand = new Random();
	private String nom;
	private int argent;
	private ArrayList<Pokemon> sacADos = new ArrayList<>();
	
	public Dresseur(String nom, int argent)
	{
		this.nom = nom;
		this.argent = argent;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public int getArgent()
	{
		return this.argent;
	}
	
	public int getNbPkmns()
	{
		return this.sacADos.size();
	}
	
	public void capturerPokemons()
	{
		int r = rand.nextInt(1, 4);
		
		for(int i = 0; i <= r; i++)
		{
			Pokemon pkmn = null;
			r = rand.nextInt(0, 3);
			switch(r)
			{
				case 0:  
				{
					pkmn = new PokemonFeu(getNom() + "Pkmn" + i);
					break;
				}
				case 1: 
				{
					pkmn = new PokemonEau(getNom() + "Pkmn" + i);
					break;
				}
				case 2:  
				{
					pkmn = new PokemonPlante(getNom() + "Pkmn" + i);
					break;
				}
					
			}
			log("J'ai capturé " + pkmn.toString());
			sacADos.add(pkmn);
		}
	}
	
	public boolean peutCombattre()
	{
		for(int i = 0; i < sacADos.size(); i++)
		{
			if(sacADos.get(i).isKO())
			{
				return false;
			}
		}
		if(argent <= 0)
		{
			return false;
		}
		return true;
	}
	
	public Pokemon prochainPokemon()
	{
		for(int i = 0; i < sacADos.size(); i++)
		{
			if(!sacADos.get(i).isKO())
			{
				return sacADos.get(i);
			}
		}
		return null;
	}
	
	public void prendreArgent(Dresseur adversaire)
	{
		adversaire.argent = adversaire.getArgent() - 10;
	}
	
	public void combattre(Dresseur d)
	{
		log("Je te défie, " + d.getNom() + "!");
		while(d.peutCombattre() && this.peutCombattre())
		{
			Pokemon dres1 = prochainPokemon();
			Pokemon dres2 = d.prochainPokemon();
			dres1.attaquer(dres2);
			dres2.attaquer(dres1);
		}
		if(!d.peutCombattre())
		{
			log("J'ai gagné!");
		}else
		{
			d.log("Haha c'est moi qui ai gagné!");
		}
			
		
	}
	
	public void pokeCenter()
	{
		for(int i = 0; i < sacADos.size(); i++)
		{
			sacADos.get(i).soigner();
		}
		log("Tous mes pokémons ont été soignés!");
	}
	
	public void log(String msg)
	{
		System.out.println(this.getNom() + " - " + msg);
	}
	
	
}
