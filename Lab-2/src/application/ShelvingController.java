package application;

import java.io.IOException;
import java.util.Date;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ShelvingController {

	@FXML private Label name;
	@FXML private Label time;
	@FXML public Button stack;
	@FXML public Button shoppingCart;
	@FXML public Button pay;
	@FXML public Button out;
	
	public static Main main;
	
	public void initialize() {
		name.setText((String) main.getUser().getName());
		time.setText((String) main.getUser().getTime());
	}
	
	public void Stack(Event event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Stack.fxml"));
			Scene scene = new Scene(root);
			Stage windows = (Stage)((Node)event.getSource()).getScene().getWindow();
			
			windows.setScene(scene);
			windows.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void shoppingCart(Event event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("shoppingCart.fxml"));
			Scene scene = new Scene(root);
			Stage windows = (Stage)((Node)event.getSource()).getScene().getWindow();
			
			windows.setScene(scene);
			windows.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void pay(Event event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Pay.fxml"));
			Scene scene = new Scene(root);
			Stage windows = (Stage)((Node)event.getSource()).getScene().getWindow();
			
			windows.setScene(scene);
			windows.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void out(Event event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Banner.fxml"));
			Scene scene = new Scene(root);
			Stage windows = (Stage)((Node)event.getSource()).getScene().getWindow();
			
			windows.setScene(scene);
			windows.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}