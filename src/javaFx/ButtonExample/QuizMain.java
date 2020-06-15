package javaFx.ButtonExample;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class QuizMain extends Application {

	
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Quiz.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("버튼예제");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
