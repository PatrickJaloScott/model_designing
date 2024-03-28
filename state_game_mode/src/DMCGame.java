import dmc.character.DanteCharacter;

public class DMCGame {
    public static void main(String[] args) {
        DanteCharacter dante = new DanteCharacter();
        dante.attack();
        dante.shoot();
        dante.specialMove();
        dante.switchStyle();
        dante.specialMove();
        dante.switchStyle();
        dante.switchWeapon();
        dante.attack();
        dante.specialMove();
    }
}