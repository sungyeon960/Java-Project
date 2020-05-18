package java200512;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[] arry = new int[3];
		for(int i=0;i<arry.length;i++) {
			System.out.println("arry["+i+"] : "+arry[i]);
		}
		arry[0]=10;
		arry[1]=20;
		arry[2]=30;
		for(int i=0;i<arry.length;i++) {
			System.out.println("arry["+i+"] : "+arry[i]);
		}
		
		double[] arry2 = new double[3];
		for(int i=0;i<arry.length;i++) {
			System.out.println("arry2["+i+"] : "+arry2[i]);
		}
		arry2[0]=20;
		arry2[1]=22;
		arry2[2]=75;
		for(int i=0;i<arry.length;i++) {
			System.out.println("arry["+i+"] : "+arry2[i]);
		}
		String[] arry3 = new String[3];
		for(int i=0;i<arry.length;i++) {
			System.out.println("arry["+i+"] : "+arry3[i]);
		}
		arry3[0]="3월";
		arry3[1]="7월";
		arry3[2]="12월";
		for(int i=0;i<arry.length;i++) {
			System.out.println("arry["+i+"] : "+arry3[i]);
		}
	}

}
