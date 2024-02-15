package pokemonversiot;

public class Combusken extends PokemonHahmoTila implements ActingPokemon {
    private static Combusken combusken;

    private Combusken() {
        xpLimit = 15;
    }

    public static PokemonHahmoTila getInstance() {
        if (combusken == null) {
            combusken = new Combusken();
            System.out.println("\nSay hello to Combusken!");
        }
        return combusken;
    }
    @Override
    public void gainXp(PocketMonster mon, int amount) {
        this.xp += amount;
        if (this.xp >= xpLimit) {
            System.out.println("Combusken is evolving!");
            evolve(mon, Blaziken.getInstance());
        }
    }

    @Override
    public void physicalMove() {
        System.out.println("Combusken used Quick Attack");
    }

    @Override
    public void statusMove() {
        System.out.println("Combusken used Detect");
    }

    @Override
    public void specialMove() {
        System.out.println("Combusken used Ember");
    }
}
