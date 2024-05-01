package metropolia.patricsc.otp.command_model_jfx.components;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Valkokangas {
    final GraphicsContext graphicsContext;
    // 0 = ylhäällä, 10 = alhaalla
    double siirtyminen = 0;

    public Valkokangas(GraphicsContext gc) {
        this.graphicsContext = gc;
        this.graphicsContext.setFill(Color.GREEN);
    }

    public void ylos() {
        if(siirtyminen > 0) {
            this.graphicsContext.setFill(Color.WHITE);
            this.graphicsContext.fillRect(0, 0, 200, 20*siirtyminen);
            siirtyminen--;
            this.graphicsContext.setFill(Color.GREEN);
            this.graphicsContext.fillRect(0, 0, 200, 20*siirtyminen);
        }
    }

    public void alas() {
        if(siirtyminen < 10) {
            siirtyminen++;
            this.graphicsContext.fillRect(0, 0, 200, 20*siirtyminen);
        }
    }
}
