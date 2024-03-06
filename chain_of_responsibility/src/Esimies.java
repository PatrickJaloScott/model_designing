public abstract class Esimies {
    protected static final int BASE_RAISE = 2;
    private Esimies seuraavaYlos;

    public void setSeuraava(Esimies seuraavaYlos) {
        this.seuraavaYlos = seuraavaYlos;
    }

    public void acceptRaiseRequest(RaiseRequest request) {
        if(seuraavaYlos != null) {
            seuraavaYlos.acceptRaiseRequest(request);
        }
    }
}
