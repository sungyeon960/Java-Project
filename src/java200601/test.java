package java200601;

import java.util.Arrays;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[s.nextInt()];

		for (int i = 0; i < num.length; i++) {
			num[i] = s.nextInt();
		}

		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
	}
}
