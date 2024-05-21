package metropolia.patricsc.suunnittelumallit.flyweight_program.application;

import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public enum BorderFactory {

	INSTANCE;
	
	private Border shareableRedBorder = new Border( new BorderStroke(Color.RED, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)); 
	
	
	public Border getBorder() {
		return shareableRedBorder;
	}

	
}
