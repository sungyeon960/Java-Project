package _200508;

import java.util.Scanner;

public class GradeExample {

	public static void main(String[] args) {
		// 사용자로부터 점수를 입력받아
		int score;
		Scanner s = new Scanner(System.in);
		
		System.out.print("학점을 입력하시오 : ");
		score = s.nextInt();
		//switch(score - score%10) {
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A입니다.");
			break;
		case 8:
			System.out.println("B입니다.");
			break;
		case 7:
			System.out.println("C입니다.");
			break;
		case 6:
			System.out.println("D입니다.");
			break;
		default:
			System.out.println("F입니다.");
			
		}
		
		s.close();
	}

}
