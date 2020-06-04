package java200603;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		int result = 0;
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.print("어떤 수로 나누시겠습니까?");
			int num1 = s.nextInt();
			System.out.print("어떤 수로 나누시겠습니까?");
			int num2 = s.nextInt();
			result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		}
	}
}
