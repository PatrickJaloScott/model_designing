package dmc.character;

import dmc.states.guns.*;
import dmc.states.styles.*;
import dmc.states.weapons.*;

public class DanteCharacter {
    StyleState currentStyle;
    // current melee
    WeaponState currentWeapon;
    // current gun
    GunState currentGun;
    public DanteCharacter() {
        currentStyle = Swordmaster.getInstance();
        currentWeapon = DevilSwordDante.getInstance();
        currentGun = EbonyAndIvory.getInstance();
    }

    public StyleState getCurrentStyle() {
        return this.currentStyle;
    }

    public void switchStyle() {
        currentStyle.changeStyle(this);
    }
    public void changeStyle(StyleState style) {
        this.currentStyle = style;
    }

    public WeaponState getCurrentWeapon() {
        return this.currentWeapon;
    }

    public void changeWeapon(WeaponState weapon) {
        this.currentWeapon = weapon;
    }
    public void switchWeapon() {
        currentWeapon.changeWeapon(this);
    }

    public GunState getCurrentGun() {
        return this.currentGun;
    }

    public void changeGun(GunState gun) {
        this.currentGun = gun;
    }
    public void switchGun() {
        currentGun.changeGun(this);
    }

    public void specialMove() {
        currentStyle.specialMove(this);
    }

    public void attack() {
        currentWeapon.normalAttack();
    }

    public void shoot() {
        currentGun.shoot();
    }
}
