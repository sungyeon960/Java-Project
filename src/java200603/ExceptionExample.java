package java200603;

/*
떠넘기기
public class ExceptionExample {
	public static void main(String[] args) throws ClassNotFoundException{
			Class.forName("java.lang.String");
	}
}
*/

/*
일반적인 예외처리
 
public class ExceptionExample {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// 일반적인 방식
			e.printStackTrace();
		}
	}
}

실제 개발 시
전에는 try catch를 사용
최근에는 예외떠넘기기
각 페이지에서 예외 처리하기에는 너무 
*/

public class ExceptionExample{
	public static void main(String[] args) throws Exception{
		Class.forName("java.la\ng.String");
		throw new Exception();
	}
}