package application;

import java.io.IOException;
import java.util.Date;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BannerController {

	@FXML private TextField txName;
	@FXML private Button btEnter;
	private Date date;
	
	public static Main main;
	
	public void intialize() {
		
	}
	
	public void enter(Event event) {
		date = new Date();	
		main.setNombre(txName.getText());
		main.setTime(date.getHours()+":"+date.getMinutes());
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Shelving.fxml"));
			Scene scene = new Scene(root);
			Stage windows = (Stage)((Node)event.getSource()).getScene().getWindow();
			
			windows.setScene(scene);
			windows.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}