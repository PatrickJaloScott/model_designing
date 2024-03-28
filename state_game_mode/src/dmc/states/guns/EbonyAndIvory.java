package dmc.states.guns;

import dmc.character.DanteCharacter;

public class EbonyAndIvory extends GunState {
    private static EbonyAndIvory ebonyAndIvory;
    private EbonyAndIvory() {}

    public static EbonyAndIvory getInstance() {
        if (ebonyAndIvory == null) {
            ebonyAndIvory = new EbonyAndIvory();
        }
        return ebonyAndIvory;
    }
    @Override
    public void changeGun(DanteCharacter dante) {
        dante.changeGun(CoyoteA.getInstance());
    }

    @Override
    public void shoot() {
        System.out.println("Dual pistol shot");
    }

    @Override
    public void specialShoot() {
        System.out.println("Rapid dual shot");
    }
}