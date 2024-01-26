public class Main {

    public static void main(String[] args) {
        AterioivaOtus[] otukset = new AterioivaOtus[3];
        otukset[0] = new Opettaja();
        otukset[1] = new Oppilas();
        otukset[2] = new Tavallinen();

        for (int i = 0; i < 3; i++) {
            otukset[i].aterioi();
        }
    }
}
