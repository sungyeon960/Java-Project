package java200609;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDateTimeFormatter {
	public static void main(String args[]) {
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		String formatted = current.format(formatter);
		System.out.println(formatted);
	}
}