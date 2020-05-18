package homework;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int a,b, max, min;
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		a=s.nextInt();
		System.out.print(" 번째 숫자를 입력하세요 : ");
		b=s.nextInt();
		
		max = ((a+b) + Math.abs(a-b))/2;
		min = ((a+b) - Math.abs(a-b))/2;
		
		System.out.println("큰 수를 작은수로 나눈 몫은 "+max/3+"이고, "
				+ "나머지는 "+max%min+"이다.");
		
		
		s.close();
	}

}
