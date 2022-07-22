package chap15.collection_introduction;

/*
 * 컬렉션 : 데이터(객체)를 쉽게 저장하고, 삭제하고, 검색할 수 있는 방법을 제공한다. (인터페이스로 만들어짐)
 * 분류 : List, Set, Map -> 인터페이스
 * - List, Set은 Collection을 상속 : 부모가 가지는 메소드를 상속을 받으므로 비슷한 성격을 가진다.
 * - Map은 독자적인 인터페이스를 가진다.
 * 
 * List : 배열과 유사하다. 확장성을 제공(무한대로 저장 가능)
 * 여러분이 데이터베이스에 저장된 것을 다룰 때 많이 사용된다.
 *  - 순서를 유지한다. (인덱스를 사용)
 *  - 저장된 값을 중복 가능하다.
 *  - 구현객체 : ArrayList(단일 스레드), LinkedList, Vector(다중 스레드 환경)
 *  
 * Set : 집합
 *  - 중복을 허용하지 않는다. -> 기존에 있는 요소와 새로 추가되는 것의 중복을 비교하기 위해 논리적 동등비교가 수행된다.
 *  	객체를 정의할 때 equals()와 hashCode()를 재정의를 해야 한다.
 *  - 순서를 가지지 않는다. 넣은 순서대로 꺼내는 것이 아니라 임의의 순서로 꺼내진다.
 *  - 구현 객체 : HashSet, TreeSet(검색을 빠르게 할 때)
 *  
 * Map : 키와 값의 쌍으로 데이터를 저장 -> 빠르게 데이터를 가져올 때 많이 사용된다.
 *  - 키는 중복되지 않는다.
 *  - 값은 중복을 허용
 *  - 구현 객체 : HashMap(단일 스레드), HashTable(다중 스레드), TreeMap(검색을 빠르게), Properties
 */

public class CollectionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
