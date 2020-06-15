package java200615;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class RootController implements Initializable {
	@FXML
	private TextField txtTitle;
	@FXML
	private PasswordField txtPassword;
	@FXML
	private ComboBox<String> comboPublic;
	@FXML
	private DatePicker dateExit;
	@FXML
	Button btnReg;
	@FXML
	Button btnCancel;
	@FXML
	TextArea txtContent;
	@FXML
	CheckBox visibleCheckBox;
	@FXML Label contentsLabel;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//콤보박스
		// ObservableList<String> list = FXCollections.observableArrayList();
		ObservableList<String> list = FXCollections.observableArrayList("공개", "비공개");
		// list.add("공개");
		// list.add("비공개");
		comboPublic.setItems(list);
		
		// 내용 보여주기
		//visibleCheckBox.selectedProperty() //선택되어있으면
		visibleCheckBox.selectedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				contentsLabel.setVisible(observable.getValue());
				txtContent.setVisible(observable.getValue());
//				if(observable.getValue()) {
//					contentsLabel.setVisible(true);
//					txtContent.setVisible(true);
//				}else {
//					contentsLabel.setVisible(false);
//					txtContent.setVisible(false);
//				}
			}
		});
		txtPassword.lengthProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				visibleCheckBox.setSelected(observable.getValue().intValue()>0);
//				if(observable.getValue().intValue()>0) {
//					visibleCheckBox.setSelected(true);
//				}else {
//					visibleCheckBox.setSelected(false);
//				}
			}
		});
	}

	public void handleBtnRegAction(ActionEvent e) {
//		StringBuilder br = new StringBuilder();
//		br.append("제목: "+titleField.getText()+"\n");
		String title = txtTitle.getText();
		System.out.println("제목: " + title);

		String password = txtPassword.getText();
		System.out.println("비밀번호: " + password);

		String strPublic = comboPublic.getValue();
		System.out.println("공개여부: " + strPublic);

		LocalDate localDate = dateExit.getValue();
		if (localDate != null) {
			System.out.println("종료일자: " + localDate.toString());
		}

		String content = txtContent.getText();
		System.out.println("내용: " + content);
	}

	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}