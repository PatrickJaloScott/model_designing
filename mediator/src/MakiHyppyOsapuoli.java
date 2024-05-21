public abstract class MakiHyppyOsapuoli {
    protected BaseMediator mediator;

    public MakiHyppyOsapuoli(BaseMediator mediator) {
        this.mediator = mediator;
        mediator.lisaaOsapuoli(this);
    }

    public abstract void vastaanota(double numeroArvo);
}
