package java200522;

public class MemberSErviceExample2 {
	public static void main(String[] args) {
		MemberService ms = new MemberService();
		boolean result =ms.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인");
		}
		else {
			System.out.println("땡");
		}
	}
}
