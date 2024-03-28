package dmc.states.styles;

import dmc.character.DanteCharacter;

public abstract class StyleState {
    public abstract void specialMove(DanteCharacter dante);
    public abstract void changeStyle(DanteCharacter dante);
}
