import java.util.HashSet;
import java.util.Set;

/**
 * Mediator-luokka
 */
public class Hyppykilpailu implements BaseMediator {
    private Set<MakiHyppyOsapuoli> osapuolet;

    public Hyppykilpailu() {
        this.osapuolet = new HashSet<>();
    }

    @Override
    public void lahetaHyppy(double pituus) {
        for (MakiHyppyOsapuoli osapuoli : osapuolet) {
            if (osapuoli.getClass().getSimpleName().equals("Kisasihteeri")) {
                ((Kisasihteeri) osapuoli).aloitaUusiArvio();
            }
        }
        for (MakiHyppyOsapuoli osapuoli : osapuolet) {
            if(osapuoli.getClass().getSimpleName().equals("Mittamies")) {
                osapuoli.vastaanota(pituus);
            }
        }
    }

    @Override
    public void lahetaMittaus(double pyoristys) {
        for (MakiHyppyOsapuoli osapuoli : osapuolet) {
            if(osapuoli.getClass().getSimpleName().equals("Arvostelutuomari")) {
                osapuoli.vastaanota(pyoristys);
            }
        }
    }

    @Override
    public void lahetaArvio(double pituusArvo, int arviopiste) {
        for (MakiHyppyOsapuoli osapuoli : osapuolet) {
            if(osapuoli.getClass().getSimpleName().equals("Kisasihteeri")) {
                osapuoli.vastaanota(arviopiste);
            }
        }
    }

    @Override
    public void lahetaTulos() {
    }

    @Override
    public void lisaaOsapuoli(MakiHyppyOsapuoli osapuoli) {
        osapuolet.add(osapuoli);
    }

    public void arvioiHyppy() {
    }
}
