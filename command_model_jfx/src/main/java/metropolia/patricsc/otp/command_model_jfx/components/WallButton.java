package metropolia.patricsc.otp.command_model_jfx.components;

import metropolia.patricsc.otp.command_model_jfx.interfaces.Command;

public class WallButton {
    final Command command;

    public WallButton(Command cmd) {
        this.command = cmd;
    }

    public void push() {
        command.execute();
    }
}
