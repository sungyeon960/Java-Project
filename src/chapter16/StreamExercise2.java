package chapter16;

import java.util.Arrays;
import java.util.List;

public class StreamExercise2 {
	public static void main(String[] args) {
		String names = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		List<String> list = Arrays.asList(names.split(","));
		
		long cnt1 = list.stream().filter(t -> t.startsWith("김")).count();
		long cnt2 = list.stream().filter(t -> t.startsWith("이")).count();
		long cnt3 = list.stream().filter(t -> t.contains("이재영")).count();
		System.out.print("김씨는 몇 명? " + cnt1+"명\n"+"이씨는 몇 명? " + cnt2+"명\n"+"이재영은 몇 번? "+cnt3+"번\n중복제거\n");	

		list.stream().distinct().forEach(t -> System.out.print(t+" "));
		System.out.println();

		System.out.print("중복제거 오름차순\n");
		list.stream().distinct().sorted().forEach(t -> System.out.print(t+" "));
		
		
		System.out.println("\n\n강사님");
//		String string = list.stream().distinct().reduce(new BinaryOperator<String>() {
//			
//			@Override
//			public String apply(String t, String u) {
//				return t+", "+u;
//			}
//		}).get();
		String string = list.stream().distinct().reduce((t, u) -> t + ", " + u).get();
		String sortedString = list.stream().distinct().sorted().reduce((t, u) -> t + ", " + u).get();
		System.out.println(string+"\n\n"+sortedString);
		
	}
}
