package homework;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		int year;
		Scanner s = new Scanner(System.in);
		
		System.out.print("윤년인지를 확인할 연도를 입력하세요 : ");
		year = s.nextInt();
		
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.println(year+"은 윤년입니다.");
		}else System.out.println(year+"은 윤년이 아닙니다.");
		
		s.close();
	}

}
