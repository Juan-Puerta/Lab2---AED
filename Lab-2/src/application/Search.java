package application;

import java.io.IOException;
import java.util.Optional;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Book;
import model.Client;

public class Search {
	
	@FXML public TextField isbn;
	@FXML public Button search;
	@FXML public Button out;
	
	public static Main main;
	
	public void initialize() {
		
	}
	
	public void search() {
		Book book = main.getLibrary().getBooks().search(isbn.getText());
		isbn.setText("");
		message(book);
	
	}
	
	public void message(Book b) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle ("COMPRA DE LIBROS");
		alert.setHeaderText ("Existen "+b.getAmount()+" libros en la estanteria");
		alert.setContentText ("Deseas comprar el libro con un valor de: $"+b.getValue());
		ButtonType buttonTypeOne = new ButtonType ("COMPRAR");
		ButtonType buttonTypeCancel = new ButtonType ("CANCELAR", ButtonData.CANCEL_CLOSE);
		alert.getButtonTypes (). setAll (buttonTypeOne, buttonTypeCancel);

		Optional < ButtonType > result = alert.showAndWait ();
		if (result.get () == buttonTypeOne) {if ( result . get () == buttonTypeOne ) {  
		  
		} else {
		    alert.close();
			}
		}
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
