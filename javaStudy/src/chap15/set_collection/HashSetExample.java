package chap15.set_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set : 집합
 * - 중복 저장 불가
 *  + 저장하고자 하는 객체는 논리적 동등 비교가 필요하고,
 *  + hashCode()와 equals() 메소드를 재정의해야 한다.
 * - 순서를 유지하지 않는다.
 * 구현객체 : HashSet(단일 스레드 환경), LinkedHashSet, TreeSet(순서를 유지)
 */

public class HashSetExample {

	public static void main(String[] args) {
		Set<String>	set = new HashSet<>();
		set.add("홍길동");
		set.add("홍길동");	// 동일한 요소는 삽입 불가
		set.add("JAVA");
		set.add("오라클");
		System.out.println(set.size());
		
		// set에 있는 데이터를 꺼내올 때
		// 반복자 iterator를 사용해서 하나씩 반복해서 꺼내온다.
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String value = iter.next();
			System.out.println(value);
		}
		// 넣은 순서 : 홍길동, JAVA, 오라클 
		// 출력 : JAVA, 오라클, 홍길동 -> 순서를 유지하지 않는다.
		
		// 집합을 비운다 : clear()
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비었습니다.");
		}

	}

}
