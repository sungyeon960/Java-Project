package lecture;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		double r, h, z, v;
		Scanner s = new Scanner(System.in);
		
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위 : cm) ");
		r=s.nextDouble();
		
		System.out.print("원기둥의 높이를 입력하시.(단위 : cm) ");
		h=s.nextDouble();
		
		z=Math.PI*r*r;
		v=z*h;
		
		System.out.print("원기둥 밑변의 넓이는 "+z+"㎠ 이고, 원기둥의 부피는 "+v+"㎤이다.");
		
		s.close();
	}

}
