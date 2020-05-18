package java200511;

public class ex2 {

	public static void main(String[] args) {
		// p134 확인문제 3번. continue 사용
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
			sum += i;
		}
		System.out.println("3의 배수의 총 합은? " + sum);
	}
}
