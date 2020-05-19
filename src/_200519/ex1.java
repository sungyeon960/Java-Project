package _200519;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("몇 명의 성적?");
		int[] num = new int [s.nextInt()];
		int sum = 0;
		double avg=0.0;
		for (int i = 0; i < num.length; i++) {
			System.out.print("성적 입력: ");
			num[i]=s.nextInt();
			sum+=num[i];
		}
		s.close();
		avg=(double)sum/num.length;
		System.out.println("총점은 "+sum+"점이고, 평균은 "+avg+"점 입니다.");
		
	}
}
