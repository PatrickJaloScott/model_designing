package pokemonversiot;

public class Blaziken extends PokemonHahmoTila implements ActingPokemon {
    private static Blaziken blaziken;

    private Blaziken() {
        xpLimit = Integer.MAX_VALUE;
    }

    public static PokemonHahmoTila getInstance() {
        if(blaziken == null) {
            blaziken = new Blaziken();
            System.out.println("Say hello to Blaziken!\nThis is the final evolution of this pokemon");
        }
        return blaziken;
    }
    @Override
    public void gainXp(PocketMonster mon, int amount) {
        this.xp += amount;
    }

    @Override
    public void physicalMove() {
        System.out.println("Blaziken used Blaze Kick");
    }

    @Override
    public void statusMove() {
        System.out.println("Blaziken used Focus Energy");
    }

    @Override
    public void specialMove() {
        System.out.println("Blaziken used Flamethrower");
    }
}
