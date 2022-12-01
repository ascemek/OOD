package lab07;

/**
 * @author Sami Cemek
 * @date Oct 25 2020
 * @version 1.1
 * 
 * Each Pokemon is a Player. Two Pokemons take part in every battle.
 * Pokemon in this version cannot use their defend points to reduce the impact of attacks. 
 * Hit policies: during every hit, one Pokemon attacks the other with 50% of its attack point. In
 * each iteration, a Player loses its health by the amount of the attacked point (50% of the
 * attack point of the attacker).
 * 
*/

public class PokemonBattle extends Player {

    public PokemonBattle(int id, int attack, int health) {
        super(id, attack, health);
    }
    
    //we will override this method as its differ from the abstract class
    @Override
    public int getAttack() {
		
		return this.attack / 2;
	}
    
}
