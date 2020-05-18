package homework;

import java.util.Scanner;

public class ex0408 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("허용오차 >> ");
		double tolerance = s.nextDouble();
		double pi=3;
		double sign=1;
		int count=0;
		for(int i=2;true;i+=2) {
			pi+=4.0/(i*(i+1)*(i+2))*sign;
			sign*=-1;
			count++;
			if(Math.abs(Math.PI-pi)<tolerance) {
				break;
			}
		}
		System.out.println("원래파이 = "+Math.PI);
		System.out.println("만든파이 = "+pi);
		System.out.println("반복횟수 = "+count);
		s.close();
	}

}
