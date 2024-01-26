import boss.*;
import interfaces.*;

public class BossClothingFactory extends AbstractClothingFactory {
    @Override
    public LippisIF createLippis() {
        return new BossLippis();
    }

    @Override
    public KengatIF createKengat() {
        return new BossKengat();
    }

    @Override
    public FarmariIF createFarmari() {
        return new BossFarmari();
    }

    @Override
    public TPaitaIF createTPaita() {
        return new BossTPaita();
    }
}
