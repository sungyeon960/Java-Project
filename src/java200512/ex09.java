package java200512;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0, sum=0;
		int[] scores = null;
		double avg=0.0;
		Scanner s = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = s.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = s.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = s.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			} else if (selectNo == 4) {
				for (int i = 0; i < scores.length; i++) {
					sum+=scores[i];
				}
				avg=(double) sum/scores.length;
				System.out.println("최고 점수: "+sum);
				System.out.println("평균 점수: "+avg);

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		s.close();
	}

}
