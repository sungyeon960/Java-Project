package chapter18;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class fileIOMain extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("fileIO.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("파일입출력");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
