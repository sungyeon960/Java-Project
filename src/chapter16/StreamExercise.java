package chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamExercise {
	public static void main(String[] args) {
		String names = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		List<String> arrayList = Arrays.asList(names.split(","));
		List<String> nameSet = new ArrayList<>();
		int cnt = 0;
		int cntK = 0;
		int cntL = 0;

		for (String name : arrayList) {
			if (name.startsWith("김")) {
				cntK++;
			} else if (name.startsWith("이")) {
				cntL++;
			}
			if (name.contains("이재영")) {
				cnt++;
			}
			if (!nameSet.contains(name)) {
				nameSet.add(name);
			}
		}
		System.out.print("김씨는 몇 명? " + cntK + "명\n" + "이씨는 몇 명? " + cntL + "명\n" 
					+ "이재영 몇 번? " + cnt + "번\n" + "중복제거\n" + nameSet+"\n");

		Collections.sort(nameSet);
		System.out.println("중복제거 오름차순");
		System.out.println(nameSet);

	}
}
