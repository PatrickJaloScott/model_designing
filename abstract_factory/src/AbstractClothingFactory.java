import interfaces.*;

public abstract class AbstractClothingFactory {

    LippisIF lippis;
    KengatIF kengat;
    FarmariIF farmari;
    TPaitaIF tPaita;

    public abstract LippisIF createLippis();
    public abstract KengatIF createKengat();
    public abstract FarmariIF createFarmari();
    public abstract TPaitaIF createTPaita();

    public void pue() {
        if (lippis == null) {
            lippis = createLippis();
        }
        if (kengat == null) {
            kengat = createKengat();
        }
        if (farmari == null) {
            farmari = createFarmari();
        }
        if (tPaita == null) {
            tPaita = createTPaita();
        }
    }
    public void luettele() {
        System.out.printf("Jasperilla on pukeillaan %s, %s, %s ja %s\n", farmari, tPaita, lippis, kengat);
    }
}
