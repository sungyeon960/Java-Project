package java200610;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("김길동", 50);
		map.put("동장군", 80);
		map.put("김길동", 55);
		System.out.println("총 Entry수: " + map.size());
		
		//객체 찾기
		System.out.println("\t김길동: "+map.get("김길동"));
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+": "+value);
		}
		System.out.println();
		
		//객체삭제
		map.remove("김길동");
		System.out.println("총 Entry 수: "+map.size());
		
		//객체를 하나씩 처리
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+": "+value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: "+map.size());
	}
}
