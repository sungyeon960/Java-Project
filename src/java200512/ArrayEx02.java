package java200512;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83,90,87};
		
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		System.out.println("총합: "+sum);
		
		int sum2 = add(new int[] {83,90,87});
		System.out.println("총합: "+sum2);
		System.out.println();
		}
	public static int add(int[] scores) {
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		return sum;
	}

}
