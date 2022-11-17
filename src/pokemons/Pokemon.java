package pokemons;

import java.util.Random;

public abstract class Pokemon {

	private Random rand = new Random();
	private String nom;
	private int niveau;
	private static int niveauMax = 11;
	protected int hp;
	private TypePokemon type;
	private int atk;
	
	public Pokemon(String nom, TypePokemon type)
	{
		this.nom = nom;
		this.type = type;
		niveau = rand.nextInt(1, niveauMax);
		hp = 2 * niveau;
		atk = (niveau / 2) + 1;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public int getNiveau()
	{
		return this.niveau;
	}
	
	public int getHP()
	{
		return this.hp;
	}
	
	public int getAtk()
	{
		return this.atk;
	}
	
	public TypePokemon getType()
	{
		return this.type;
	}
	
	public boolean isKO()
	{
		return hp == 0; 
	}
	
	public void soigner()
	{
		hp = 2 * niveau;
	}
	
	public abstract void attaquer(Pokemon p);
	public abstract void subir(Pokemon p);
	
	@Override
	public String toString()
	{
		return nom + " - Type " + type + " - Niv. " + niveau + " - HP : " + hp + "/" + (2*niveau) + " - ATK: " + atk;
	}
	
	public void log(String msg)
	{
		System.out.println(nom + " - " + msg);
	}
	
	
	
	
	
}
