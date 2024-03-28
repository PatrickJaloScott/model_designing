package dmc.states.guns;

import dmc.character.DanteCharacter;

public class CoyoteA extends GunState {
    private static CoyoteA coyoteA;
    private CoyoteA() {}

    public static CoyoteA getInstance() {
        if (coyoteA == null) {
            coyoteA = new CoyoteA();
        }
        return coyoteA;
    }
    @Override
    public void shoot() {
        System.out.println("Shotgun blast");
    }

    @Override
    public void specialShoot() {
        System.out.println("Round blasts");
    }

    @Override
    public void changeGun(DanteCharacter dante) {
        dante.changeGun(EbonyAndIvory.getInstance());
    }
}