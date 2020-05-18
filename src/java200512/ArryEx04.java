package java200512;

public class ArryEx04 {

	public static void main(String[] args) {
		int[] arry = {83,90,87};
		int sum = 0;
		double avg=0.0;
		for(int i=0;i<arry.length;i++) {
			sum+=arry[i];
		}

		avg=(double)sum/arry.length;
		System.out.println(sum);
		System.out.println(avg);
		
	}

}
