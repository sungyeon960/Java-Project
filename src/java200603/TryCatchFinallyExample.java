package java200603;


public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String");
			System.out.println("문자열 객체");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace(); // 에러출력줄
			System.out.println("에러발생");
		}
		// 무조건 실행시키기
		// try로 끝나든 catch로 끝나든
		finally {
			System.out.println("프로그램 종료");
		}
		
		/*
		// ClassNotFoundException만 캐치를 함
		// 다른 예외는 잡지 못해
		catch (ClassNotFoundException e) {
			e.printStackTrace(); // 에러출력줄
			System.out.println("존재x");
		}
		
		// 가능~ Exception은 모든 에러의 조상이므로
		// 모든 에러를 잡는다.
		catch (Exception e) {
			e.printStackTrace(); // 에러출력줄
			System.out.println("존재x");
		}
		*/
		
		/*
		try {
			Class clazz = Class.forName("java.lang.String");
			System.out.println("문자열 객체");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace(); // 에러출력줄
			System.out.println("에러발생");
		}
		System.out.println("프로그램 종료");
		*/
		
		/*
		 try {
			Class clazz = Class.forName("java.lang.String");
			System.out.println("문자열 객체");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace(); // 에러출력줄
			System.out.println("에러발생");
		}
		// 무조건 실행시키기
		// try로 끝나든 catch로 끝나든
		finally {
			System.out.println("프로그램 종료");
		}
		 */
	}
}
