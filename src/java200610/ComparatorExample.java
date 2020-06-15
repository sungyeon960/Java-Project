package java200610;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		Set<Fruit> set = new TreeSet<Fruit>(new Comparator<Fruit>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {
				if(o1.getPrice() < o2.getPrice()) {
					return 1;//큰게 앞쪽으로! 작은게 뒤쪽으로
				}else if(o1.getPrice()==o2.getPrice()) {
					return 0;
				}else {
					return -1;
				}
			}
		});
		set.add(new Fruit("포도", 1000));
		set.add(new Fruit("수박", 1000));
		set.add(new Fruit("딸기", 1000));
		Iterator<Fruit> iterator = set.iterator();
		while (iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit);
		}
	}
}
