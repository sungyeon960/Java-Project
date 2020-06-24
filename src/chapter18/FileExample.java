package chapter18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) throws Exception {
		// new FileInputStream(file) file객체가 들어가
		// new FileInputStream(new File(파일경로(절대경로))))
		FileInputStream inputStream = new FileInputStream(new File("/home/pc24/200513.sql"));
		byte[] buffer = new byte[2048];//한번에 처리// 메모리 낭비 
		// 읽을 바이트없으면(파일의 끝이라면) -1을 리턴
		while (inputStream.read(buffer) != -1) {
//			System.out.println(buffer);//바이트 타입(숫자) 바이트를 문자로
			System.out.print(new String(buffer));
		}
		inputStream.close();//자원반납
//		FileOutputStream outputStream = new FileOutputStream(new File("/home/pc24/자바로만든파일.txt"));
//		//버퍼가 필요!
//		// 내가 입력한 글자가 버야
//		//outputStream.write("자바로 파일을 만들었어요."); string타입
//		outputStream.write("자바로 파일을 만들었어요.".getBytes());//byte단위로 리턴
//		outputStream.close();
	}
}
