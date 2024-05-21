import java.util.ArrayList;
import java.util.List;

public class Tulostaulu extends MakiHyppyOsapuoli {
    private List<Tulosrivi> rivit = new ArrayList<>();

    public Tulostaulu(BaseMediator mediator) {
        super(mediator);
    }

    @Override
    public void vastaanota(double numeroArvo) {
    }
}
