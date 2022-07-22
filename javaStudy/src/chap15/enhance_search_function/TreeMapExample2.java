package chap15.enhance_search_function;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");
		
		// 정렬된 Map를 얻는다.
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		// 정렬된 엔트리 셋을 얻는다.
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		for (Map.Entry<Integer, String> entry : descendingEntrySet)
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		System.out.println();
		
		// descendingMap() 한번 더 실행하면 오름차순으로 정렬
		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		for (Map.Entry<Integer, String> entry : ascendingEntrySet)
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
	}

}
