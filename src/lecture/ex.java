package lecture;

import java.util.Scanner;

public class ex {
	public static void main(String[] args) {
		double width, height, area, perimeter;
		Scanner s = new Scanner(System.in);
		
		System.out.print("가로의 길이는?(단위: m):");
		width = s.nextDouble();
		
		System.out.print("세로의 길이는?(단위: m):");
		height = s.nextDouble();
		
		area = width*height;
		perimeter=2*(width+height);
		
		System.out.println("직사각형의 넓이 : "+ area);
		System.out.println("직사각형의 둘레 : "+ perimeter);
	
		s.close();
	}

}
