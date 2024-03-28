package dmc.states.styles;

import dmc.character.DanteCharacter;

public class Swordmaster extends StyleState {
    private static Swordmaster swordmaster;
    private Swordmaster() {}
    public static StyleState getInstance() {
        if (swordmaster == null) {
            swordmaster = new Swordmaster();
        }
        System.out.println("Swordmaster");
        return swordmaster;
    }
    @Override
    public void specialMove(DanteCharacter dante) {
        // melee special
        dante.getCurrentWeapon().specialAttack();
    }

    @Override
    public void changeStyle(DanteCharacter dante) {
        dante.changeStyle(Gunslinger.getInstance());
    }
}
