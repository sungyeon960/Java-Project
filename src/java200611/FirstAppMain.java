package java200611;

import java.util.Optional;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FirstAppMain extends Application {// 추상클래스

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label();
		label.setText("Hello, JavaFx");
		label.setFont(new Font(50));
		// 위와 같은 코드
		// label.setFont(Font.font(50));
		
		Button btn = new Button();
		btn.setText("확인");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Optional<ButtonType> wait = new Alert(AlertType.INFORMATION, "프로그램 종료", ButtonType.CLOSE).showAndWait();
				if(wait.get() == ButtonType.CLOSE) {
				Platform.exit();
				}
			}
		});
		
		VBox vBox = new VBox();
		vBox.setAlignment(Pos.CENTER);
		vBox.setSpacing(20);
		vBox.setPadding(new Insets(20));
		vBox.getChildren().add(label);
		vBox.getChildren().add(btn);
		
		
		Scene scene = new Scene(vBox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
