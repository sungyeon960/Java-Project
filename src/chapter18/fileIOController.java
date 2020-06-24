package chapter18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class fileIOController {

	@FXML
	TextArea textArea;
	private File file;

	@FXML
	public void openAction() throws Exception {
		FileChooser chooser = new FileChooser();
		file = chooser.showOpenDialog(null);
//
//		String path = dialog.getPath();
//		FileInputStream inputStream = new FileInputStream(new File(path));
//		byte[] buffer = new byte[2048];
//		while (inputStream.read(buffer) != -1) {
//			textArea.setText(new String(buffer));
//		}
		FileReader reader=new FileReader(file);
		char[] cbuf = new char[4];
		reader.read(cbuf);//캐릭터버퍼
		StringBuffer buffer = new StringBuffer();
		while (reader.read(cbuf)!=-1) {
			buffer.append(new String(cbuf));
		}
		reader.close();
		textArea.setText(new String(buffer));
	}

	// 저장
	@FXML
	public void storeAction() throws Exception {
//		FileOutputStream outputStream = new FileOutputStream(new File("/home/pc24/자바로만든파일.txt"));
//		//버퍼가 필요!
//		// 내가 입력한 글자가 버퍼야
//		//outputStream.write("자바로 파일을 만들었어요."); string타입
//		outputStream.write(textArea.getText().getBytes());//byte단위로 리턴
//		outputStream.close();
		FileWriter writer = new FileWriter(file);
		writer.write(textArea.getText());
		writer.close();
	}

	@FXML
	public void newAction() throws Exception {
		textArea.setText("");
	}

}
