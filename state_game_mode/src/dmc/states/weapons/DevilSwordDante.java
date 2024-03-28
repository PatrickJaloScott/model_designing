package dmc.states.weapons;

import dmc.character.DanteCharacter;

public class DevilSwordDante extends WeaponState {
    private static DevilSwordDante devilSword;
    private DevilSwordDante() {}

    public static DevilSwordDante getInstance() {
        if (devilSword == null) {
            devilSword = new DevilSwordDante();
        }
        return devilSword;
    }
    @Override
    public void normalAttack() {
        System.out.println("Slash");
    }

    @Override
    public void specialAttack() {
        System.out.println("Hovering blades");
    }

    @Override
    public void changeWeapon(DanteCharacter dante) {
        dante.changeWeapon(Balrog.getInstance());
    }
}
