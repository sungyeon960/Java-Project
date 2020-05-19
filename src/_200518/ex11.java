package _200518;

public class ex11 {
	public static void main(String[] args) {
		boolean[] bool = new boolean[12];
		
		for(int i=0;i<bool.length;i++) {
			if(i==4||i==7||i==11) {
				bool[i]=true;
	   		}
			System.out.println("bool["+i+"] = "+bool[i]);
		}
		
	}
}
