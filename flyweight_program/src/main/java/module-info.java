module metropolia.patricsc.suunnittelumallit.flyweight_program {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens metropolia.patricsc.suunnittelumallit.flyweight_program to javafx.fxml;
    exports metropolia.patricsc.suunnittelumallit.flyweight_program;
}