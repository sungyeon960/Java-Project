package _200519;

import java.util.Scanner;

public class ex17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int year = s.nextInt();
		int month = s.nextInt();
		int day = s.nextInt();
		int[] date = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int result = 0;

		for (int i = 0; i < month; i++) {
			if (((year % 4 == 0) && (year != 100)) || (year == 400)) {
				date[2] = 29;
			}
			result += date[i];

		}
		System.out.println("현재까지 " + (result + day) + "일");
		s.close();
	}
}
