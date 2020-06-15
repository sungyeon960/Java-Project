package java200611.scene;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//fxml파일 불러오기(같은 패키지 내에서만 가능)
		Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("처음 JavaFX 파일");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
