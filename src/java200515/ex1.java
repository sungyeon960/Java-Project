package java200515;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		/*
		 * 1. 변수 inputNum을 선언하고 사용자로부터 정수를 입력받아
		 * 그 값을 inputNum에 저장한 뒤 그 값을 콘솔에 출력하라.
		 */
		Scanner s = new Scanner(System.in);
		int inputNum = s.nextInt();
		
		System.out.println(inputNum);
		s.close();
	}
}
