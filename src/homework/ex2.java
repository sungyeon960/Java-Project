package homework;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		int city, people, year;
		Scanner s = new Scanner(System.in);

		System.out.print("수도입니까?(수도:1, 수도아님:0) ");
		city = s.nextInt();
		System.out.print("총 인구?(단위:만) ");
		people = s.nextInt();
		System.out.print("연소득이 1억 이상인 인구는?(단위:만) ");
		year = s.nextInt();

		if ((city == 1 && people >= 100) || (year >= 50)) {
			System.out.println("이 도시는 메트로폴리스입니다.");
		}else System.out.println("이 도시는 메트로폴리스가 아닙니다.");
		s.close();
	}

}
