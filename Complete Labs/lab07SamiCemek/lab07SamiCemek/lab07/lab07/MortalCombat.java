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
 * 𝑑𝑒𝑓𝑒𝑛𝑑𝑒𝑟'𝑠 𝑟𝑒𝑚𝑎𝑖𝑛𝑖𝑛𝑔 ℎ𝑒𝑎𝑙𝑡ℎ = 𝑐𝑢𝑟𝑟𝑒𝑛𝑡 ℎ𝑒𝑎𝑙𝑡ℎ 𝑝𝑜𝑖𝑛𝑡 −
 * (𝑎𝑡𝑡𝑎𝑐𝑘 𝑝𝑜𝑖𝑛𝑡 𝑜𝑓 𝑡ℎ𝑒 𝑎𝑡𝑡𝑎𝑐𝑘𝑒𝑟 – 10% 𝑜𝑓 𝑑𝑒𝑓𝑒𝑛𝑑 𝑝𝑜𝑖𝑛𝑡𝑠 𝑜𝑓 𝑡ℎ𝑒 𝑑𝑒𝑓𝑒𝑛𝑑𝑒𝑟)
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
