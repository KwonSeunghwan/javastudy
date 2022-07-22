package chap11.objects_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// HashMap 컬렉션을 이용해서 사람 이름을 저장 : (Key, String)쌍으로 데이터를 저장
		// HashMap 객체를 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		// 홍길동을 저장 : 저장할 때 put 메소드를 사용 = new Key(1), 값 = 홍길동
		hashMap.put(new Key(1), "홍길동");
		// hashMap에서 데이터를 꺼내올 때 get 메소드를 사용하고 키 값을 매개변수에 준다.
		String value = hashMap.get(new Key(1));
		System.out.println(value); 	// null -> 키 값을 못 찾음 -> 키 값이 다르다.
		// 논리적 동등 비교를 하는 방법
		// 두 객체(new Key(1))의 hashCode()가 같고, equals()가 같아야 한다. -> 다르다.
		// 논리적 동등 비교를 위헤서 hashCode와 equals 메소드를 재정의 해야 한다.

	}

}
