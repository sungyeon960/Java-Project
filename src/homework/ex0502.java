package homework;

import java.util.Random;

public class ex0502 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int[] frequency= new int[6];
		
		for (int i = 0; i < 10000; i++) {
			int num = r.nextInt(6) + 1; // 1~6
			frequency[num-1]++;
		}
		
		
		System.out.println("------------");
		System.out.println("면" + "\t" + "빈도");
		System.out.println("------------");
		for (int i = 0; i < frequency.length; i++) {
			System.out.println((i+1)+"\t" + frequency[i]);
		}
	}
}
