public interface BaseMediator {
    void lahetaHyppy(double pituus);
    void lahetaMittaus(double pyoristys);
    void lahetaArvio(double pituusArvo, int arviopiste);
    void lahetaTulos();
    void lisaaOsapuoli(MakiHyppyOsapuoli osapuoli);
}
