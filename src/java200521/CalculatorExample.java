package java200521;

public class CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10*10*Caculator.pi;
		int result2 = Caculator.plus(10,5);
		int result3 = Caculator.minus(10, 5);
		int result4 = Caculator.minus(10, 4);
		
		System.out.println(result1);	// 314.159
		System.out.println(result2);	// 15
		System.out.println(result3);	// 5
		System.out.println(result4);	// 6
	}
}
