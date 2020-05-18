package java200515;


public class ex8 {
	public static void main(String[] args) {
		int sum  =0;
		for(int i=1;;i++) {
			sum+=i;
			if(sum>100) {
				System.out.println("합> "+sum);
				System.out.println("100이 넘는 숫자 " + i);
				break;
			}
		}
	}
}
