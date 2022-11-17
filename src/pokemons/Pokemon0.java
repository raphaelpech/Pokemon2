package pokemons;

import java.util.Random;

public class Pokemon0 {

	private Random rand = new Random();
	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	
	public Pokemon0(String nom)
	{
		this.nom = nom;
		niveau = rand.nextInt(1, 11);
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
	
	public boolean isKO()
	{
		return hp == 0; 
	}
	
	public void soigner()
	{
		hp = 2 * niveau;
	}
	
	public void attaquer(Pokemon0 p)
	{
		log("J'attaque " + p.getNom() + "!");
		p.hp -= this.atk;
	}
	
	@Override
	public String toString()
	{
		return nom + " - Niv. " + niveau + " - HP : " + hp + "/" + (2*niveau) + " - ATK: " + atk;
	}
	
	public void log(String msg)
	{
		System.out.println(nom + " - " + msg);
	}
	
	
	
}
