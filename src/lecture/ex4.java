package lecture;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		int d_500, d_100, d_50, d_10, sum=0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("500원짜리 동전의 갯수 : ");
		d_500 = s.nextInt();
		
		System.out.print("100원짜리 동전의 갯수 : ");
		d_100 = s.nextInt();
		
		System.out.print("50원짜리 동전의 갯수 : ");
		d_50 = s.nextInt();
		
		System.out.print("10원짜리 동전의 갯수 : ");
		d_10 = s.nextInt();
		
		sum = d_500*500+d_100*100+d_50*50+d_10*10;
		System.out.println("저금통 안의 동전의 총 액수 : "+sum);
		
		s.close();
	}

}
