package java200609;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<Phone> list = new ArrayList<>();
		System.out.println("----------------------------1----------------------------");
		list.add(new Phone("Velvet", 64, "LG"));
		list.add(new Phone("Galaxy", 128, "Samsung"));
		list.add(new Phone("iPhone", 256, "Apple"));

		for (Phone phone : list) {
			System.out.println(phone);
		}

		System.out.println("\n" + "----------------------------2----------------------------");
		list.add(1, new Phone("사이언", 16, "LG"));
		for (Phone phone : list) {
			System.out.println(phone);
		}
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(list.get(i));
//		}

		// 지우기
		System.out.println("\n" + "----------------------------3----------------------------");
		list.remove(2); // 갤럭시 지우기
		for (Phone phone : list) {
			System.out.println(phone);
		}

		// 전체크기출력
		System.out.println("\n" + "----------------------------4----------------------------");
		System.out.println("전체크기: " + list.size());

		// 필요한 항목 가져오기
		System.out.println("\n" + "----------------------------5----------------------------");
		Phone velvetPhone = list.get(0); // 0번째(velvet폰)
		System.out.println(velvetPhone); // velvet폰에 대한 정보 가져오기

		// clear
		System.out.println("\n" + "----------------------------6----------------------------");
		list.clear(); // 전부 지우기~!
		System.out.println("전체크기: " + list.size()); // 0이 나옴

	}
}
