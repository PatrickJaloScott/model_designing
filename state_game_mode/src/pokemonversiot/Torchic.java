package pokemonversiot;

public class Torchic extends PokemonHahmoTila implements ActingPokemon {
    private static Torchic torchic;

    private Torchic() {
        xpLimit = 10;
    }

    public static PokemonHahmoTila getInstance() {
        if(torchic == null) {
            torchic = new Torchic();
        }
        return torchic;
    }

    public void gainXp(PocketMonster mon, int amount) {
        this.xp += amount;
        if(this.xp >= xpLimit) {
            System.out.println("Torchic is evolving!");
            evolve(mon, Combusken.getInstance());
        }
    }

    @Override
    public void physicalMove() {
        System.out.println("Torchic used Scratch");
    }

    @Override
    public void statusMove() {
        System.out.println("Torchic used Sand Attack");
    }

    @Override
    public void specialMove() {
        System.out.println("Torchic used Flamethrower");
    }
}
