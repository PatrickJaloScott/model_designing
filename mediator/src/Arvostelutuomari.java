import java.util.Random;

public class Arvostelutuomari extends MakiHyppyOsapuoli {
    public Arvostelutuomari(BaseMediator mediator) {
        super(mediator);
    }

    @Override
    public void vastaanota(double numeroArvo) {
        System.out.print("Tuomari sai: " + numeroArvo);
        Random arvioArpo = new Random();
        int tuomaripisteet = arvioArpo.nextInt(10) + 10;
        System.out.println(", Antaa pisteitä: " + tuomaripisteet);
        mediator.lahetaArvio(numeroArvo, tuomaripisteet);
    }
}
