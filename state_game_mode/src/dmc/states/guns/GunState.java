package dmc.states.guns;

import dmc.character.DanteCharacter;

public abstract class GunState {
    public abstract void shoot();
    public abstract void specialShoot();
    public abstract void changeGun(DanteCharacter dante);
}
