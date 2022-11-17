package pokemons;

public class PokemonEau extends Pokemon {

	public PokemonEau(String nom) {
		super(nom, TypePokemon.EAU);
	}

	@Override
	public void attaquer(Pokemon p) {
		log("J'attaque " + p.getNom() + "!");
		p.subir(this);
	}

	@Override
	public void subir(Pokemon p) {
		switch(p.getType())
		{
			case FEU :{
				this.hp = (int) (this.getHP() - (0.5 * p.getAtk()));
				p.log("Ce n'est pas très efficace...");
				break;
			}
			case EAU :{
				this.hp = (int) (this.getHP() - (0.5 * p.getAtk()));
				p.log("Ce n'est pas très efficace...");
				break;
			}
			case PLANTE :{
				this.hp = (this.getHP() - (2 * p.getAtk()));
				p.log("C'est super efficace!");
				break;
			}
			
			default: {
				this.hp = (this.getHP() - (1 * p.getAtk()));
				break;
			}
		}
	}

}
