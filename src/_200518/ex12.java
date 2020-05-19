package _200518;

public class ex12 {
	public static void main(String[] args) {
		int[] cost= {85,42,37,10,22,8,15};
		int totalCost=0;
		for(int i=0;i<cost.length;i++) {
			totalCost+=cost[i];
		}
		System.out.println("합은 = "+ totalCost);
	}
}
