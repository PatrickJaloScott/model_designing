package dmc.states.weapons;

import dmc.character.DanteCharacter;

public abstract class WeaponState {
    public abstract void normalAttack();
    public abstract void specialAttack();
    public abstract void changeWeapon(DanteCharacter dante);
}
