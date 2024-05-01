module metropolia.patricsc.otp.command_model_jfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens metropolia.patricsc.otp.command_model_jfx to javafx.fxml;
    exports metropolia.patricsc.otp.command_model_jfx;
}