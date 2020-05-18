package lecture;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x입력>>");
		double x = sc.nextDouble();
		System.out.print("y입력>>");
		double y = sc.nextDouble();
		double z = x%y;
		
		if(Double.isNaN(z)) //z가 숫자가 아닐때
			System.out.println("0.0으로 나눌 수 없습니다.");
		else {
			double result = z+10;
			System.out.println("결과 = "+result);
		}
		sc.close();
	}
}
