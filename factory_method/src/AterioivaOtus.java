import interfaces.*;

public abstract class AterioivaOtus {

    Juoma juoma = null;
    Ruoka ruoka = null;

    public abstract Juoma createJuoma();
    public abstract Ruoka createRuoka();

    public void aterioi(){
        syo();
        juo();
    }

    public void syo(){
        if (ruoka == null) {
            ruoka = createRuoka();
        }
        System.out.println("Kylläpä " + ruoka + " maistuukin hyvältä");
    }


    public void juo(){
        if (juoma == null)
            juoma = createJuoma();
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
    }
}
