package chap15.map_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		System.out.println("총 엔트리의 수 : " + map.size());
		// 논리적 동등비교를 구현하지 않으면, 논리적으로 중복된 키 값을 가진다.
	}

}
