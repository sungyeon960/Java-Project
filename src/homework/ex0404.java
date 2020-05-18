package homework;

import java.util.Scanner;

public class ex0404 {

	public static void main(String[] args) {
		String gameC, gameY;
		Scanner s = new Scanner(System.in);

		System.out.println("가위 바위 보 게임");
		System.out.print("철수: ");
		gameC = s.next();
		System.out.print("영희: ");
		gameY = s.next();

		if (gameC.equals("가위") && gameY.equals("바위") || gameC.equals("주먹") && gameY.equals("보")
				|| gameC.equals("보") && gameY.equals("가위")) {
			System.out.println("결과 : 영희 승리!");
		} else if (gameY.equals("가위") && gameC.equals("바위") || gameY.equals("주먹") && gameC.equals("보")
				|| gameY.equals("보") && gameC.equals("가위")) {
			System.out.println("결과 : 철 승리!");
		} else {
			System.out.println("결과 : 비김");
		}
		s.close();
	}

}
