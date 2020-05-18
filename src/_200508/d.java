package _200508;

public class d {

	public static void main(String[] args) {
		GCD(63,72);
		System.out.println(GCD(63,72));
	}
	public static int GCD(int a, int b) {
		if(b==0)
			return a;
		else {
			return GCD(b, a%b);
		}
	}

}
