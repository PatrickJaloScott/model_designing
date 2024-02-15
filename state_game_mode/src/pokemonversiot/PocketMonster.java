package pokemonversiot;

public class PocketMonster {
    PokemonHahmoTila hahmoTila;
    public PocketMonster() {
        hahmoTila = Torchic.getInstance();
    }
    protected void evolve(PokemonHahmoTila tila) {
        hahmoTila = tila;
    }

    public PokemonHahmoTila getHahmoTila() {
        return hahmoTila;
    }
}
