package lecture;

import java.util.Scanner;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int x;
		Scanner s = new Scanner(System.in);
		System.out.print("점수 입력하시오 : ");
		x=s.nextInt();
		
		if(x>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		}
		else if(x>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		}
		else if(x>=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		}
		else{
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D입니다.");
		}
		s.close();
	}

}
