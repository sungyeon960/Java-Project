package java200515;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1, num2;
		System.out.print("1> ");
		num1 = s.nextInt();
		System.out.print("2> ");
		num2 = s.nextInt();

		if (num1 > num2) {
			System.out.println("큰수: " + num1 + ", 작은수: " + num2);
		} else if (num1 < num2) {
			System.out.println("큰수: " + num2 + ", 작은수: " + num1);
		} else if (num1 == num2) {
			System.out.println("같다");
		} else {
			System.out.println("잘못입력");
		}
		s.close();

	}

}
