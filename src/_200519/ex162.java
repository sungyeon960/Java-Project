package _200519;

import java.util.Scanner;

public class ex162 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[5];
		
		
		for (int i = 0; i < num.length; i++) {
			num[i] = s.nextInt();
			for (int j = 0; j < i; j++) {
					if (num[i] == num[j]) {
						System.out.println("다시");
						i--;
					}
			}
		}
		s.close();
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
