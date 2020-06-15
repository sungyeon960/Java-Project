package java200609;

public class FindAndReplaceExample {
	public static void main(String[] args) {
		String str = "모든 프로그램은 자바언어로 개발 될 수 있어";
		int index = str.indexOf("자바");
		if(index ==-1) {
			System.out.println("자바 문자열이 포함되어 있지 않아");
		}
		else {
			System.out.println("자바 문자열이 포함되어 있어");
			str=str.replace("자바", "Java");
			System.out.println("->"+str);
		}
	}
}
