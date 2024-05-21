public class Hyppy {
    private double pituus;
    private double tyylipiste;

    public void setPituus(double pituus) {
        this.pituus = pituus;
    }

    public double getPituus() {
        return pituus;
    }

    public void setTyylipiste(double tyylipiste) {
        this.tyylipiste = tyylipiste;
    }

    public double getTyylipiste() {
        return tyylipiste;
    }

    @Override
    public String toString() {
        return String.format("hypätiin %.2fm, josta arvioitiin %.1f pistettä", pituus, tyylipiste);
    }
}
