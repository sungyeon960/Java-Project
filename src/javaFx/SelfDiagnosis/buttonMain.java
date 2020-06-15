package javaFx.SelfDiagnosis;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class buttonMain extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("button.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("AppMain");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
