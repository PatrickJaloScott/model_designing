package pokemonversiot;

public abstract class PokemonHahmoTila {
    int xp = 0, xpLimit = 0;
    public abstract void gainXp(PocketMonster mon, int amount);

    protected void evolve(PocketMonster pokemon, PokemonHahmoTila form) {
        pokemon.evolve(form);
    }
}
