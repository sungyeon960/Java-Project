package chapter16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IteratorVsStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("기미눼", "김뉴운", "기민쥐");

		// 1.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

		// 2.
		list.stream().forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		System.out.println();

		// 3. 2의 람다
		list.stream().forEach(t -> System.out.println(t));
		System.out.println();
		
		// 4. 3의 람다
		list.stream().forEach(System.out::println);
		System.out.println();

		// 5.map
		// Function<T, R> t는 매개변수타입, r은 리턴
		list.stream().map(new Function<String, String>() {
			@Override
			public String apply(String t) {
				return "♡" + t + "♡";
			}
		}).forEach(System.out::println);
		System.out.println();

		// 6.map의 람다
		list.stream().map(t -> "♡" + t + "♡").forEach(System.out::println);
		System.out.println();

		// 7. '기'를 가진 애들만 반환
		list.stream().filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.contains("기"); // true값만 반환
			}
		}).map(t -> "♡" + t + "♡").forEach(System.out::println);
		System.out.println();

		// 8. 7의 람다
		list.stream().filter(t -> t.contains("기")).map(t -> "♡" + t + "♡").forEach(System.out::println);
		System.out.println();
		
		System.out.println("9");
		// 9. '기'를 가진 애들이 몇 명?
		long count = list.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.contains("기");
			}
		}).count();
		System.out.println();
		
		// 10. 9의 람다
		long count2 = list.stream().filter(t -> t.contains("기")).count();
		System.out.println(count2);	
		System.out.println();
		
		// 책
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}

		System.out.println();

		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}
}
