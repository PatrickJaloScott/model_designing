package dmc.states.styles;

import dmc.character.DanteCharacter;

public class Gunslinger extends StyleState {
    private static Gunslinger gunslinger;
    private Gunslinger() {}
    public static StyleState getInstance() {
        if(gunslinger == null) {
            gunslinger = new Gunslinger();
        }
        System.out.println("Gunslinger");
        return gunslinger;
    }
    @Override
    public void changeStyle(DanteCharacter dante) {
        dante.changeStyle(Swordmaster.getInstance());
    }

    @Override
    public void specialMove(DanteCharacter dante) {
        dante.getCurrentGun().specialShoot();
    }
}