package _200518;

import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
		String[] name;
		int num;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		name = new String[num];

		for (int i = 0; i < num; i++) {
			name[i] = s.next();
		}

		for (int i = 0; i < num; i++) {
			if (i == 0) {
				System.out.print(name[i]);
			} else {
				System.out.print(", " + name[i]);
			}
		}
		s.close();
	}
}
