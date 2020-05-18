package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex0406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		String result="0 1 ";
		while (true) {
			int len = Integer.parseInt(br.readLine());
			if(len<3) {
				continue;
			}
			for (int i = 2; i < len; i++) {
				num3 = num1 + num2;
				result += num3 + " ";
				num1 = num2;
				num2 = num3;
			}
			System.out.println(result);
			break;
		}
		br.close();
	}
}
