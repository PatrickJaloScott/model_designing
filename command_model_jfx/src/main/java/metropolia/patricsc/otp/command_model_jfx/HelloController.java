package metropolia.patricsc.otp.command_model_jfx;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import metropolia.patricsc.otp.command_model_jfx.commands.SwitchDownCommand;
import metropolia.patricsc.otp.command_model_jfx.commands.SwitchUpCommand;
import metropolia.patricsc.otp.command_model_jfx.components.Valkokangas;
import metropolia.patricsc.otp.command_model_jfx.components.WallButton;

public class HelloController {

    @FXML
    private Canvas valkokanvas;

    Valkokangas tauluKangas;
    WallButton upButton;
    WallButton downButton;

    @FXML
    void onValkokangasYlosClick() {
        upButton.push();
    }

    @FXML
    void onValkokangasAlasClick() {
        downButton.push();
    }

    public void initialize() {
        tauluKangas = new Valkokangas(valkokanvas.getGraphicsContext2D());
        upButton = new WallButton(new SwitchUpCommand(tauluKangas));
        downButton = new WallButton(new SwitchDownCommand(tauluKangas));
    }
}
