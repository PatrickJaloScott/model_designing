import pokemonversiot.ActingPokemon;
import pokemonversiot.PocketMonster;

import java.util.Scanner;

public class PokemonPeli {
    public static void main(String[] args) {
        Scanner playerInput = new Scanner(System.in);

        PocketMonster pokemon = new PocketMonster();
        for (int i = 0; i < 20; i++) {
            randomMove(pokemon);
            playerInput.nextLine();
        }
    }

    static void randomMove(PocketMonster monster) {
        ActingPokemon fighter = (ActingPokemon) monster.getHahmoTila();

        int randIndex = (int)Math.floor(Math.random()*3);
        switch (randIndex) {
            case 0:
                fighter.physicalMove();
                break;
            case 1:
                fighter.statusMove();
                break;
            case 2:
                fighter.specialMove();
                break;
            default:
                System.out.println("Invalid random index");
        }

        monster.getHahmoTila().gainXp(monster, 2);
    }
}