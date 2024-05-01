package metropolia.patricsc.otp.command_model_jfx.commands;

import metropolia.patricsc.otp.command_model_jfx.interfaces.Command;
import metropolia.patricsc.otp.command_model_jfx.components.Valkokangas;

public class SwitchDownCommand implements Command {
    private final Valkokangas valkokangas;

    public SwitchDownCommand(Valkokangas kangas) {
        this.valkokangas = kangas;
    }

    @Override
    public void execute() {
        valkokangas.alas();
    }
}
