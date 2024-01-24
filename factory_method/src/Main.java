public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja(),
                opiskelija = new Oppilas(),
                tavallinen = new Tavallinen();
        opettaja.aterioi();
        opiskelija.aterioi();
        tavallinen.aterioi();
    }
}
