package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ShelvingController {

	@FXML private Label name;
	@FXML private Label time;
	
	public static Main main;
	
	public void initialize() {
		name.setText((String) main.getUser().getName());
		time.setText((String) main.getUser().getTime());
	}
}
