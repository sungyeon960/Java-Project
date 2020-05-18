package java200515;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"월은 "+30+"일 까지");
			break;
		case 2:
			System.out.println(month+"월은 "+28+"일 까지");
			break;
		default:
			System.out.println(month+"월은 "+31+"일 까지");
			break;
		}
		s.close();
	}
}
