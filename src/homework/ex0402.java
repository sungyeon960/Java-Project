package homework;

import java.util.Scanner;

public class ex0402 {

	public static void main(String[] args) {
		int month;
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("월을 입력하세요(1~12): ");
			month = s.nextInt();

			if (month >= 3 && month <= 5) {
				System.out.println(month + "월은 봄입니다." + "\n");
			} else if (month >= 6 && month <= 8) {
				System.out.println(month + "월은 여름입니다." + "\n");
			} else if (month >= 9 && month <= 11) {
				System.out.println(month + "월은 가을입니다." + "\n");
			} else if (month >= 12 && month <= 2) {
				System.out.println(month + "월은 겨울입니다." + "\n");
			} else {
				System.out.println(month + "월은 잘못된 입력입니다." + "\n");
				break;
			}
		}

		s.close();

	}

}
