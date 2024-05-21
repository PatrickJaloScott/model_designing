import java.util.Random;

public class Hyppaaja extends MakiHyppyOsapuoli {
    private final Hyppy hyppy1, hyppy2;

    public Hyppaaja(BaseMediator mediator) {
        super(mediator);
        hyppy1 = new Hyppy();
        hyppy2 = new Hyppy();
    }

    public void hyppaa() {
        Random pituusArpo = new Random();
        double kEro = (10 - pituusArpo.nextDouble(20))*2 + 60;
        if(hyppy1.getTyylipiste() == 0 && hyppy1.getPituus() == 0) {
            hyppy1.setPituus(kEro);
            mediator.lahetaHyppy(hyppy1.getPituus());
        } else if (hyppy2.getTyylipiste() == 0 && hyppy2.getPituus() == 0) {
            hyppy2.setPituus(kEro);
            mediator.lahetaHyppy(hyppy2.getPituus());
        }
    }

    @Override
    public void vastaanota(double numeroArvo) {
    }
}
