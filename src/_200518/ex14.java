package _200518;

public class ex14 {
	public static void main(String[] args) {
		int[] num = {38,94,16,3,76,94,82,47,57,8};
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println(min);
	}
}
