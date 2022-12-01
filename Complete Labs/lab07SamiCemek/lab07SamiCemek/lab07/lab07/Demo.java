package lab07;

/**
 * 
 * @author Sami Cemek
 * @date Oct 25 2020
 * @version 1.1
 */

public class Demo{
    public static void main(String[] args) {

        // instance of PokemonBattle
        PokemonBattle Pikachu = new PokemonBattle(1,50,100);
        PokemonBattle Eevee = new PokemonBattle(2,30,100);

        // Player1 = "Pikachu" , Player2 = "Eevee"
        // it should print the player1 Pikachu
        PokemonBattle.fight(Pikachu, Eevee);

        // instance of MortalCombat
        MortalCombat Mileena = new MortalCombat(20,20, 100, 100);
        MortalCombat SubZero = new MortalCombat(10, 40,100, 200);
        
        // Player1 = "Mileena" , Player2 = "SubZero"
        // it should print the player2 SubZero
        MortalCombat.fight(Mileena, SubZero);
        
    }
}

