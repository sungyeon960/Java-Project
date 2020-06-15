package java200609;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		// split()
		String[] string = str.split(",");
		for (String strings : string) {
			System.out.println(strings);
		}
		System.out.println();
		// stringtokenizer
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			String ststr = st.nextToken();
			System.out.println(ststr);
		}
	}
}
