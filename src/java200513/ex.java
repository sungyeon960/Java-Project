package java200513;

import java.util.Random;
import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		// 가위 바위 보
		// 컴퓨터와 사람이 게임을 해서 결과를 출력
		// 출력 예) 사람: 바위
		String gameC, com;
		Random r = new Random();
		int num = r.nextInt(2);
		Scanner s = new Scanner(System.in);
		
		//배열 사용하려면
		//String num1[] ={"가위", "바위", "보"};
		//String com1 = num1[num];
		//System.out.println(com1);
	
		System.out.println("가위 바위 보 게임");
		System.out.print("철수> ");
		gameC = s.next();
		System.out.print("컴퓨터> ");
		
		
		
		if (num == 0) {
			com = "가위";
			System.out.println(com);
		} else if (num == 1) {
			com = "바위";
			System.out.println(com);
		} else {
			com = "보";
			System.out.println(com);
		}
		if (gameC.equals("가위") && com.equals("바위") || gameC.equals("주먹") && com.equals("보")
				|| gameC.equals("보") && com.equals("가위")) {
			System.out.println("결과 : 컴퓨터 승리!");
		} else if (com.equals("가위") && gameC.equals("바위") || com.equals("주먹") && gameC.equals("보")
				|| com.equals("보") && gameC.equals("가위")) {
			System.out.println("결과 : 철수 승리!");
		} else {
			System.out.println("결과 : 비김");
		}
		
		s.close();
	}

}
