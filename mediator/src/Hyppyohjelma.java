public class Hyppyohjelma {
    public static void main(String[] args) {
        Hyppykilpailu ss2Peli = new Hyppykilpailu();
        MakiHyppyOsapuoli taulu = new Tulostaulu(ss2Peli),
                mittamies = new Mittamies(ss2Peli),
                sihteeri = new Kisasihteeri(ss2Peli);
        Hyppaaja perusHyppari = new Hyppaaja(ss2Peli);
        Arvostelutuomari[] tuomarit = new Arvostelutuomari[5];
        for (int i = 0; i < tuomarit.length; i++) {
            tuomarit[i] = new Arvostelutuomari(ss2Peli);
        }
        //Arvostelutuomari tuomari = new Arvostelutuomari(ss2Peli);

        perusHyppari.hyppaa();
        perusHyppari.hyppaa();
    }
}
