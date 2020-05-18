package homework;

import java.util.Scanner;

public class ex0501 {
	public static void main(String[] args) {
		int[] a;
		int num, sum=0;
		double avg=0.0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("몇 명의 성적을 입력하시겠습니까? ");
		num = s.nextInt();
		a=new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("성적을 입력하시오: ");
			a[i]=s.nextInt();
			sum+=a[i];
		}
		
		avg=sum/a.length;
		System.out.println("총점은 "+sum+"점이고, 평균 성적은 "+avg+"점 입니다.");
		
		s.close();
	}
}
