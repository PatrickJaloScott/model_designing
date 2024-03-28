package dmc.states.weapons;

import dmc.character.DanteCharacter;

public class Balrog extends WeaponState {
    private static Balrog balrog;
    private Balrog() {}

    public static Balrog getInstance() {
        if (balrog == null) {
            balrog = new Balrog();
        }
        return balrog;
    }
    @Override
    public void normalAttack() {
        System.out.println("Punch");
    }

    @Override
    public void specialAttack() {
        System.out.println("Welter move");
    }

    @Override
    public void changeWeapon(DanteCharacter dante) {
        dante.changeWeapon(DevilSwordDante.getInstance());
    }
}