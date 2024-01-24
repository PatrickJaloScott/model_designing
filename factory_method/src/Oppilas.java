import interfaces.Juoma;
import interfaces.Ruoka;

public class Oppilas extends AterioivaOtus {
    @Override
    public Juoma createJuoma() {
        return new Limonadi();
    }

    @Override
    public Ruoka createRuoka() {
        return new Hampurilainen();
    }
}