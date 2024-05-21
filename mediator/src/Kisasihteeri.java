import tyokalut.ArrayFunction;

import java.util.ArrayList;
import java.util.List;

public class Kisasihteeri extends MakiHyppyOsapuoli {
    List<Integer> tuomarienPisteet;

    public Kisasihteeri(BaseMediator mediator) {
        super(mediator);
    }

    public void aloitaUusiArvio() {
        tuomarienPisteet = new ArrayList<>();
    }

    @Override
    public void vastaanota(double numeroArvo)  {
        tuomarienPisteet.add((int)numeroArvo);
        if(tuomarienPisteet.size() == 5) {
            int pienin = ArrayFunction.getMin(tuomarienPisteet),
                    suurin = ArrayFunction.getMax(tuomarienPisteet);
            System.out.printf("Pisteet %s, min: %d, max: %d\n", tuomarienPisteet, pienin, suurin);
            tuomarienPisteet.remove((Integer) pienin);
            tuomarienPisteet.remove((Integer) suurin);
            int summa = ArrayFunction.getSum(tuomarienPisteet);
            System.out.println(tuomarienPisteet + " Summa: " + summa);
            System.out.println();
            mediator.lahetaTulos();
        }
    }
}
