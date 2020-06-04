package java200604;

import java.util.Scanner;

public class CharAtExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inputString = s.nextLine();
		if (inputString.length() > 7) {
			System.out.println(inputString);
			for (int i = 1; i <= inputString.length(); i++) {
				System.out.println(i+"번째 글자: "+inputString.charAt(i-1));
			}
		}else {
			System.out.println("7글자 이상 입력해");
		}
		
		s.close();
	}
}
