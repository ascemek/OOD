package lab07;
/**
 * @author Sami Cemek
 * @date Oct 25 2020
 * @version 1.1
 * 
 * Each Character (like Sub-Zero, Mileena, etc.) is a Player. Two characters take part in every
 * battle.
 * Hit policies: during every hit, the attacker hits the opponent with all of their attack points.
 * From every hit of the opponent, the defender loses their health by the following rule:
 * ๐๐๐๐๐๐๐๐'๐  ๐๐๐๐๐๐๐๐๐ โ๐๐๐๐กโ = ๐๐ข๐๐๐๐๐ก โ๐๐๐๐กโ ๐๐๐๐๐ก โ
 * (๐๐ก๐ก๐๐๐ ๐๐๐๐๐ก ๐๐ ๐กโ๐ ๐๐ก๐ก๐๐๐๐๐ โ 10% ๐๐ ๐๐๐๐๐๐ ๐๐๐๐๐ก๐  ๐๐ ๐กโ๐ ๐๐๐๐๐๐๐๐)
*/

public class MortalCombat extends Player{

    public MortalCombat(int id, int attack, int health, int defend) {
        super(id, attack, health);
        this.defend = defend;
    }

    //we will override this method as its differ from the abstract class
    @Override
    public int getHealth() {
		
		return (int) (this.health - (getAttack() - getDefend() * 0.10));
	}


    // We don't have the defend feature in our abstract class so we are setting and getting them here
    public int getDefend(){
        return this.defend;
    }

    // set defend
    public void setDefend(int defend){
        this.defend = defend;

    }
}
