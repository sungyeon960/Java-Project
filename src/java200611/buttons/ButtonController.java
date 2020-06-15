package java200611.buttons;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

public class ButtonController implements Initializable {

	@FXML
	CheckBox glassesCheck;
	@FXML
	CheckBox maskCheck;
	@FXML
	ToggleGroup levelGroup;
	@FXML
	ToggleGroup languageGroup;
	@FXML
	Label resultLabel;
	private List<CheckBox> checkList;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		checkList = Arrays.asList(glassesCheck, maskCheck);
		//selectedToggleProperty() 선택된 토글버튼의 값
		languageGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				// 선택한 토글객체가 observable로 선택전 애들은 oldValue로 
				// 스위프트 눌렀다 자바를 눌러.
				// 스위프트가 oldValue가, 자바가 observable이 된다
				// 토글버튼 누른 상태 지속되게!(다시 눌리지 않도록)
				if(newValue == null) { // 같은거 눌렀을 때
					oldValue.setSelected(true);//이전것을 선택한다
				}
			}
		});
	}
	@FXML
	public void confirmAction() {
		StringBuilder sb = new StringBuilder();
//		if(glassesCheck.isSelected()) {
//			//리턴타입이 오브젝트! 
//			sb.append(glassesCheck.getUserData().toString());
//		}
//		if(maskCheck.isSelected()) {
//			sb.append(maskCheck.getUserData().toString());
//		}
		for (int i = 0; i < checkList.size(); i++) {
			if (checkList.get(i).isSelected()) {
				sb.append(checkList.get(i).getText().toString() + ", ");
			}
		}
		// 선택한 것만 가져오기~ 이 자체가 라디오버튼이 된다
		// levelGroup.getSelectedToggle();
		// getUser앞까지는 null이 아니야! null이면 getUser~을 못해!! 그래서 라디오버튼 안 눌렀으면 오류가 뜨는거야!
		// sb.append(levelGroup.getSelectedToggle().getUserData().toString());//
		// getUserData때문에 숫자가 나오는 것! 글자가 나오게 하고 싶다면 캐스팅해서 text 출력
		// null 체크
		// levelGroup.getSelectedToggle()자체는 null이 아니야
		
		if (levelGroup.getSelectedToggle() != null) {
			// sb.append(levelGroup.getSelectedToggle().getUserData().toString());
			sb.append(((RadioButton) levelGroup.getSelectedToggle()).getText()+", ");
		}
		// sb.append(((RadioButton) levelGroup.getSelectedToggle()).getText());
		if (languageGroup.getSelectedToggle() != null) {
			sb.append(languageGroup.getSelectedToggle().getUserData().toString());
		}
		resultLabel.setText(sb.toString());
	}
//
//	// 여기서 Java FX 객체를 초기화
//	@Override
//	public void initialize(URL location, ResourceBundle resources) {
//		checkList = Arrays.asList(glassesCheck, maskCheck);
//	}
}
