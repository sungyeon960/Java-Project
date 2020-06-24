package chapter18.editor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.scene.control.TextArea;

public class EditorController {

	@FXML TextField pathField;
	@FXML TextArea contentsArea;
	
	// 열기
	@FXML public void openAction() throws Exception {
		FileChooser chooser = new FileChooser();
		File file = chooser.showOpenDialog(null);
		pathField.setText(file.getPath());
		//파일 입력
//		FileReader reader = new FileReader(file);
//		BufferedReader reader2 = new BufferedReader(reader);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		//reader.readLine();//자동 string반환
		//temp 읽은 결과 담아주는 애가 필요!
		String temp;
		StringBuffer buffer = new StringBuffer();
		
		while ((temp=reader.readLine())!=null) {//한줄읽은데이터읽고 temp에 담아
												//while(buffer.append(reader.readLine())!=null) {}null일때 담으면 안 되는데 null도 담아서 이 방법은 별로 안 좋아~
												//읽은 데이터 관리하기 위함
			buffer.append(temp+"\n");
		}
		
		contentsArea.setText(buffer.toString());
		reader.close();
	}
	@FXML public void savaAction() {
		
	}
	@FXML public void savaAsAction() {
		
	}

}
