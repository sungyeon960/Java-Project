package homework;

import java.util.Scanner;

public class ex0403 {

	public static void main(String[] args) {
		int pro, db, ui, app, ml, sum = 0;
		double avg = 1;
		Scanner s = new Scanner(System.in);

		System.out.print("점수를 입력하세요." + "\n" + "프로그래밍 기초: ");
		pro = s.nextInt();
		System.out.print("데이터베이스: ");
		db = s.nextInt();
		System.out.print("화면구현: ");
		ui = s.nextInt();
		System.out.print("애플리케이션 구현: ");
		app = s.nextInt();
		System.out.print("머신러닝: ");
		ml = s.nextInt();

		sum = pro + db + ui + app + ml;
		avg = sum / 5.0;

		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		if (avg >= 90) {
			System.out.println("학점: A");
		} else if (avg >= 80 && avg < 90) {
			System.out.println("학점: B");
		} else if (avg >= 70 && avg < 80) {
			System.out.println("학점: C");
		} else if (avg >= 60 && avg < 70) {
			System.out.println("학점: D");
		} else {
			System.out.println("학점: F");
		}
		s.close();
	}

}
