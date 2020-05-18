package check;

import java.util.Random;

public class Exercise04_4 {

	public static void main(String[] args) {
		Random r = new Random();
		
		while(true) {
			int num1 = r.nextInt(6)+1;
			int num2 = r.nextInt(6)+1;
			int sum = num1+num2;
			
			if(sum==5) {
				System.out.println("("+num1+")"+"("+num2+")");
				break;
			}
			
			else
				System.out.println("("+num1+")"+"("+num2+")");
		}
	}

}
