import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Mittamies extends MakiHyppyOsapuoli {
    public Mittamies(BaseMediator mediator) {
        super(mediator);
    }

    @Override
    public void vastaanota(double numeroArvo) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.print("Mittamies sai: " + numeroArvo);
        String parsed = df.format(numeroArvo).replace(",", ".");
        System.out.println(", Pyöristetään: " + parsed);
        mediator.lahetaMittaus(Double.parseDouble(parsed));
    }
}
