import interfaces.*;

public class Tavallinen extends AterioivaOtus {
    @Override
    public Juoma createJuoma() {
        return new Maito();
    }

    @Override
    public Ruoka createRuoka() {
        return new LihapullaPeruna();
    }
}
