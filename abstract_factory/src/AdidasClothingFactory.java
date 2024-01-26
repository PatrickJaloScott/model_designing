import adidas.*;
import interfaces.*;

public class AdidasClothingFactory extends AbstractClothingFactory {

    @Override
    public LippisIF createLippis() {
        return new AdidasLippis();
    }

    @Override
    public KengatIF createKengat() {
        return new AdidasKengat();
    }

    @Override
    public FarmariIF createFarmari() {
        return new AdidasFarmari();
    }

    @Override
    public TPaitaIF createTPaita() {
        return new AdidasTPaita();
    }
}
