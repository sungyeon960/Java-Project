package javaFx.ButtonExample;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;

public class QuizController implements Initializable{
	@FXML
	CheckBox anchorcheck;
	@FXML
	CheckBox combocheck;
	@FXML
	CheckBox checkcheck;
	@FXML
	CheckBox hcheck;
	@FXML
	CheckBox listcheck;
	@FXML
	ToggleGroup togGroup;
	private List<CheckBox> checkList;
	@FXML
	Label resultLabel;

	
	@FXML
	public void confirmAction() {
		int cnt=0;
		StringBuilder sb = new StringBuilder();
		sb.append("1번 선택한 항목: ");
		for (int i = 0; i < checkList.size(); i++) {
			if (checkList.get(i).isSelected()) {
				cnt++;
				if(cnt==1) {
					sb.append(checkList.get(i).getText().toString());
				}
				else {
					sb.append(", "+checkList.get(i).getText().toString());
				}
			}
		}
		sb.append("입니다." + "\n");
		
		
		if (togGroup.getSelectedToggle() != null) {
			sb.append("2번 JavaFX는"+togGroup.getSelectedToggle().getUserData().toString());
		}
		resultLabel.setText(sb.toString());
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		checkList = Arrays.asList(anchorcheck, combocheck, checkcheck, hcheck, listcheck);
	}

}
