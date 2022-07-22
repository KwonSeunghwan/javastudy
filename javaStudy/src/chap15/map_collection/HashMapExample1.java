package chap15.map_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*	
 * Map : Map.Entry 객체를 저장 (Map.Entry 객체는 키와 값의 쌍을 저장하는 객체)
 *  - 키는 중복을 허용하지 않음
 *   -> 논리적 동등 비교를 제공해야 한다.
 *  - 값은 중복을 허용한다.
 * 구현 객체 : HashMap(단일 스레드 환경), HashTable(멀티 스레드 환경), LinkedHashMap, 
 * 			TreeMap(검색을 빠르게 하기 위해), Propertied(환경변수, 프로그램의 데이터 저장)
 */

public class HashMapExample1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		// 데이터를 저장
		map.put("한강수", 95);
		map.put("홍길동", 90);
		map.put("홍길동", 85);	// 동일한 키값을 사용하면 추가되지 않고 값이 변경된다. (90 -> 85)
		map.put("돌잡이", 80);	
		System.out.println("총 엔트리의 수 : " + map.size()); // 3개
		
		// 홍길동의 점수를 구하는 방법
		int score = map.get("홍길동");
		System.out.println("점수 : " + score); 	// 85
		
		// 키값을 사용해서 모든 엔트리 값을 구한다.
		Set<String> KeySet = map.keySet();	// 키값을 가지는 Set을 구한다.
		Iterator<String> KeyIter = KeySet.iterator();
		while(KeyIter.hasNext()) {
			String key = KeyIter.next();
			int value = map.get(key);
			System.out.println("(" + key + ". " + value + ")");
		}
		System.out.println("------------------------");
		
		// EntrySet을 이용해서 가져오는 방법
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();
		while(entryIter.hasNext()) {
			Map.Entry<String, Integer> entry = entryIter.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("(" + key + ". " + value + ")");
		}
		//
		map.clear();
		if(map.isEmpty()) {
			System.out.println("비워졌습니다.");
		}

	}

}
