package javaFx.SelfDiagnosis;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextField;

public class buttonController implements Initializable {

	@FXML
	Label sys;
	@FXML
	CheckBox visiable;
	@FXML
	Label visiableLabel;
	@FXML
	ToggleGroup oneGroup;
	@FXML
	ToggleGroup twoGroup;
	@FXML
	ToggleGroup threeGroup;
	@FXML
	ToggleGroup fourGroup;
	@FXML
	ToggleGroup fiveGroup;
	@FXML
	ToggleGroup sixGroup;
	@FXML
	ToggleButton oneY;
	@FXML
	ToggleButton oneN;
	@FXML
	ToggleButton twoY;
	@FXML
	ToggleButton twoN;
	@FXML
	ToggleButton threeY;
	@FXML
	ToggleButton threeN;
	@FXML
	ToggleButton fourY;
	@FXML
	ToggleButton fourN;
	@FXML
	ToggleButton fiveY;
	@FXML
	ToggleButton fiveN;
	@FXML
	ToggleButton sixY;
	@FXML
	ToggleButton sixN;
	private List<CheckBox> checkList;
	@FXML
	CheckBox a;
	@FXML
	CheckBox b;
	@FXML
	CheckBox c;
	@FXML
	CheckBox d;
	@FXML
	CheckBox e;
	@FXML
	CheckBox f;
	@FXML
	CheckBox g;
	@FXML
	CheckBox h;
	@FXML
	CheckBox i;
	@FXML
	CheckBox j;
	@FXML
	CheckBox k;
	@FXML
	Label label7;
	@FXML
	AnchorPane quest7Pane;
	@FXML TextField textfi;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		checkList = Arrays.asList(a, b, c, d, e, f, g, h, i, j, k, visiable);
		Date date = new Date();
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		String to = transFormat.format(date);
		sys.setText(to);

		sixY.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (observable.getValue()) {
					quest7Pane.setVisible(true);
				} else {
					quest7Pane.setVisible(false);
				}
			}
		});
		
		visiable.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (observable.getValue()) {
					textfi.setVisible(true);
				} else {
					textfi.setVisible(false);
				}
			}
		});
	}

	@FXML
	public void saveBtnAction() {
		if (oneY.isSelected()) {
			System.out.print("1번: " + 1 + "점, ");
		} else if (oneN.isSelected()) {
			System.out.print("1번: " + 0 + "점, ");
		}
		if (twoY.isSelected()) {
			System.out.print("2번: " + 1 + "점, ");
		} else if (twoN.isSelected()) {
			System.out.print("2번: " + 0 + "점, ");
		}
		if (threeY.isSelected()) {
			System.out.print("3번: " + 1 + "점, ");
		} else if (threeN.isSelected()) {
			System.out.print("3번: " + 0 + "점, ");
		}
		if (fourY.isSelected()) {
			System.out.print("4번: " + 1 + "점, ");
		} else if (fourN.isSelected()) {
			System.out.print("4번: " + 0 + "점, ");
		}
		if (fiveY.isSelected()) {
			System.out.print("5번: " + 1 + "점, ");
		} else if (fiveN.isSelected()) {
			System.out.print("5번: " + 0 + "점, ");
		}
		if (sixY.isSelected()) {
			System.out.print("6번: " + 1 + "점, 7번 ");
		} else if (sixN.isSelected()) {
			System.out.print("6번: " + 0 + "점");
		}
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for (int i = 0; i < checkList.size(); i++) {
			if (checkList.get(i).isSelected()) {
				cnt++;
				if (i == checkList.size() - 1) {
					if(cnt==1) {
					System.out.println("기타("+textfi.getText()+")");
					}
					else {
						System.out.println(", 기타(불면증)");
					}
				} else {
					if (cnt == 1) {
						System.out.print(checkList.get(i).getText().toString());
					}
					else {
						System.out.print(", "+ checkList.get(i).getText().toString());
					}
				}
			}
		}
	}

}
