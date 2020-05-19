package _200519;

import java.util.Scanner;

public class ex16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] array = new int[5];
		array[0] = s.nextInt();
		for (int i = 1; i < array.length; i++) {
			array[i] = s.nextInt();
			if (array[i] == array[i-1]) {
				System.out.println("다시");
				i = 0;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		s.close();
	}
}
