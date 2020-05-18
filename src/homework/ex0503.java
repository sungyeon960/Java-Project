package homework;

import java.util.Scanner;

public class ex0503 {
	public static void main(String[] args) {
		// 알고리즘 그대로 쓰면 된다.
		int totalDays = 0;
		String[] week = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		String okno = null;
		int year, month, day;
		// 입력
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("년도를 입력하세요: ");
			year = s.nextInt();
			System.out.print("월을 입력하세요: ");
			month = s.nextInt();
			System.out.print("일을 입력하세요: ");
			day = s.nextInt();

			// 입력
			if ((year < 1 || year > 2100) || (month > 12 || month < 1) || (day > 31 || day < 1)) {
				System.out.println("입력이 잘못되었습니다.");
				break;
			}
			// 년
			totalDays += (year - 1900) * 365;
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				if (month == 2 || month == 1) {
					totalDays += (year - 1900) / 4 - 1;
				} else {
					totalDays += (year - 1900) / 4;
				}
			}

			// 월
			switch (month) {
			case 1:
				totalDays += day;
				break;
			case 2:
				totalDays += 31 + day;
				break;
			case 3:
				totalDays += 28 + 31 + day;
				break;
			case 4:
				totalDays += 31 + 28 + 31 + day;
				break;
			case 5:
				totalDays += 30 + 31 + 28 + 31 + day;
				break;
			case 6:
				totalDays += 31 + 30 + 31 + 28 + 31 + day;
				break;
			case 7:
				totalDays += 30 + 31 + 30 + 31 + 28 + 31 + day;
				break;
			case 8:
				totalDays += 31 + 30 + 31 + 30 + 31 + 28 + 31 + day;
				break;
			case 9:
				totalDays += 30 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + day;
				break;
			case 10:
				totalDays += 31 + 30 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + day;
				break;
			case 11:
				totalDays += 30 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + day;
				break;
			case 12:
				totalDays += 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + day;
				break;
			}

			// 일
			System.out.print(year + "년 " + month + "월 " + day + "일 ");

			day = totalDays % 7;
			System.out.println(week[day] + "입니다.");

			System.out.print("계속하시겠습니까?(Y/N)");
			okno = s.next();
			if (okno == "y") {
				break;
			} else {
				continue;
			}
		}
		s.close();
	}
}
