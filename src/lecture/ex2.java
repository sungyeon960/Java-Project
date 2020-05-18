package lecture;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		int x,y;
		boolean z;
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요: ");
		x=s.nextInt();
		
		System.out.print("두번째 수를 입력하세요: ");
		y=s.nextInt();
		
		z=x>y?true:false;
		System.out.println("첫번째 수가 두번째 수보다 큰가? "+z);
		
		s.close();
	}

}
