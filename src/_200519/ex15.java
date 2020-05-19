package _200519;

import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] name = new String[s.nextInt()];
		
		for (int i = 0; i < name.length; i++) {
			name[i] = s.next();
		}

		for (int i = 0; i < name.length; i++) {
			System.out.print((i!=0)?", "+name[i]:""+name[i]);
		}
		s.close();
	}
}
