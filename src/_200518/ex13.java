package _200518;

public class ex13 {
	public static void main(String[] args) {
		int[] num = {38,94,16,3,76,94,82,47,59,8};
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<num.length;i++) {
			if(max<num[i]) {
				max=num[i];
			}
		}
		System.out.println(max);
	}
}
