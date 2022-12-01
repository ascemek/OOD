package lab07;
/**
 *
 * @author fahmida hamid
 * @author Sami Cemek
 * @date Oct 15 2020
 * @version 1.1
 *
 * The Player class is used to create a Player object with the following properties:
 *  id, health, attack
 *
 *  The Player has four properties: id, health, defend, and attack.
 * ‘id’ is used to identify each Player uniquely.
 * ‘health’, ‘defend’, and ‘attack’ are positive integers.
 * ‘attack <= health’, meaning for each Player, their attack points should not be more than their health points,
 * ‘defend (<= 100)’ expresses what percent of the attack a player can defend.
 *  If the health point goes below or equal to 0, then a player is declared dead.
 */


public abstract class Player{

	protected int attack;
	protected int health;
	protected int defend;
	protected int id;



	// consturctor
	public Player(int id, int attack, int health)
	{
		this.id = id;
		this.attack = attack;
		this.health = health;
	}

	// set health
	public void setHealth(int hp) {

		this.health -= hp;

	}

	// get health
	public int getHealth() {

		return this.health;
	}

	// get id
	public int getId() {

		return this.id;
	}

	// set id
	public void setId(int id) {

		this.id = id;
	}

	// get attack
	public int getAttack() {

		return this.attack;
	}

	/**
	 * @return true or false depending on the health point
	 */
	public boolean isDead() {
		if(health > 0)
			return false;
		else
			return true;
	}

	/**
	 * This method will print the winner between the player1 and player2
	 * @param player1 is the first player object
	 * @param player2 is the second player object
	 */
	public static void fight(Player player1, Player player2){

        boolean gameOn = true;

        int player1Health = player1.getHealth();
        int player2Health = player2.getHealth();


        while(gameOn){

            //player1 attacks player 2
            player2Health = player2Health - (player1.getAttack());
            System.out.println("Player2 health is: " + player2Health);

            //player2 attacks player 1
            player1Health = player1Health - (player2.getAttack());
            System.out.println("Player1 health is: " + player1Health);

            if((player1Health <= 0)){
                //winner is player2
                gameOn = false;
                System.out.println("The winner is: player2");
            }

           if((player2Health <= 0)){
                //winner is player1
                gameOn = false;
                System.out.println("The winner is: player1");
            }

        }

    }



}
