package homework;

public class ex2_ {

	public static void main(String[] args) {
		int sum=0;
		for(int x=1;x<=10;x++) {
			for(int y=1;y<=10;y++) {
				sum=4*x+5*y;
				
				if(sum==60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
	}

}
