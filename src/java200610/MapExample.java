package java200610;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("a001", "값1"); // entry
		// 키, 밸류
		map.put("a001", "값5"); // entry
		// 중복 키는 마지막 값으로
		map.put("a002", "값2"); // entry
		map.put("a003", "값3"); // entry
		map.put("a004", "값4"); // entry
		System.out.println("map.get(\"a001\"): "+map.get("a001")); // 값 5
		// 1. 반복자 사용
		System.out.println("entryset을 이용하는 방법 - while");
		// map.entrySet();//모든 엔트리 가져오기
//		Set<Entry<String, String>> set = map.entrySet();
//		Iterator<Entry<String, String>> iterator = set.iterator();
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
//			entry.getValue(); // 하나하나접근해서 밸류만 추출
//			entry.getKey(); // 키값이 출력
//			map.get(entry.getKey());//리턴하는 것은 키에 해당하는 밸류값 리턴
			entry.getValue();// map.get(entry.getKey())와 같아! 근데 이게 더 효율적이야
			System.out.println(entry.getValue());
		}
		// 2. foreach문
		System.out.println("entryset을 이용하는 방법 - froeach");
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}
//		3.map.keySet()//맵의 키값만 가져오기
		System.out.println("keyset을 이용하는 방법");
		Iterator<String> keyIterator = map.keySet().iterator();
		while (keyIterator.hasNext()) {
			String string = keyIterator.next();
			System.out.println(map.get(string));
		}
	}
}
