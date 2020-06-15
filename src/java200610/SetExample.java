package java200610;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<Phone> set = new HashSet<>();
		// 데이터 같지만 다른 객체로 인식!
		// 각각 6개의 데이터를 가짐
		// 같은 객체 인식하도록 할것!
		set.add(new Phone("Velvet", 64, "LG"));
		set.add(new Phone("Velvet", 64, "LG"));
		set.add(new Phone("Galaxy", 128, "Samsung"));
		set.add(new Phone("Galaxy", 128, "Samsung"));
		set.add(new Phone("iPhone", 256, "Apple"));
		set.add(new Phone("iPhone", 256, "Apple"));
		System.out.println("전체개수: " + set.size());
		
		System.out.println("Iterator문");		
		// 1. 반복자(Iterator) 이용
		Iterator<Phone> iterator = set.iterator();
		while (iterator.hasNext()) {
			// Phone phone = (Phone) iterator.next();
			// 캐스팅 할 필요 없음
			Phone phone = iterator.next();
			System.out.println(phone);
		}
		System.out.println("\n"+"foreach문");
		// 2. 향상된 for문(foreach문)
		for (Phone phone : set) {
			System.out.println(phone);
		}
	}
}
