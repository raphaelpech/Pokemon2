package pokemons;

public class PokemonFeu extends Pokemon {

	public PokemonFeu(String nom) {
		super(nom, TypePokemon.FEU);
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
				this.hp = (this.getHP() - (2 * p.getAtk()));
				p.log("C'est super efficace!");
				break;
			}
			case PLANTE :{
				this.hp = (int) (this.getHP() - (0.5 * p.getAtk()));
				p.log("Ce n'est pas très efficace...");
				break;
			}
			
			default: {
				this.hp = (this.getHP() - (1 * p.getAtk()));
				break;
			}
		}
	}

}
