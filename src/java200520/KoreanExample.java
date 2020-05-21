package java200520;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k = new Korean("박자바", "011225-1234567");
		System.out.println(k.name);
		System.out.println(k.ssn);

		Korean k2 = new Korean("김자바", "930525-0654321");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}
}
