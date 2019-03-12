package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.Library;
import model.User;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application {
	private static String nombre;
	private static String time;
	
	
	private static Library library;
	
	public Main() {
		library = new Library(3, 3);
	}
	
	
	public static Library getLibrary() {
		return library;
	}


	public void setLibrary(Library library) {
		this.library = library;
	}


	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("Banner.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("LIBRERIA DEL VALLE");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Main.nombre = nombre;
	}

	public static String getTime() {
		return time;
	}

	public static void setTime(String time) {
		Main.time = time;
	}

	public static void main(String[] args) {
		launch(args);

	}
}
