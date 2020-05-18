package homework;

import java.util.Scanner;

public class ex0401 {

	public static void main(String[] args) {
		int len1, len2, len3;
		Scanner s = new Scanner(System.in);

		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		len1 = s.nextInt();
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
		len2 = s.nextInt();
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
		len3 = s.nextInt();

		if((len1+len2<len3)&&(len1+len3<len2)&&(len2+len3<len1)){
			
		}
		s.close();
	}
}
