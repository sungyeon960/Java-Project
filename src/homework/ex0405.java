package homework;

import java.util.Random;
import java.util.Scanner;

public class ex0405 {

	public static void main(String[] args) {
		int num, ran;

		Random r = new Random();
		ran = r.nextInt(100) + 1;

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			num = s.nextInt();

			if (num == ran) {
				System.out.println("정답입니다." + "\n" + "게임을 종료합니다.");
				break;
			} else if (num > ran) {
				System.out.println("정답은 더 작은 수입니다.");
			} else if (num < ran) {
				System.out.println("정답은 더 큰 수입니다.");
			}
		}
		s.close();
	}

}
