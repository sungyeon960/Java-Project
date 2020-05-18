package java200513;

public class test {
	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		int sum=0;
		double avg = 0.0;
		for(int i:scores) {
			sum+=i;
		}
		avg = (double)sum/scores.length;
		System.out.println("점수의 총합 = "+sum);
		System.out.println("점수의 평균 = "+avg);	
	}
}
