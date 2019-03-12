package application;

import java.io.IOException;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Add {

	@FXML public TextField isbn;
	@FXML public TextField quantify;
	@FXML public TextField value;
	@FXML public TextField stack;
	@FXML public Button add;
	@FXML public Button out;
	
	
	public static Main main;
	
	public void initialize() {
		
	}
	
	public void add() {
		isbn.setText("");
		quantify.setText("");
		value.setText("");
		stack.setText("");
	}
	
	
	public void out(Event event) {
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
