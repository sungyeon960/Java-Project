package java200515;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=1;i<10;i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
		s.close();
	}
}
