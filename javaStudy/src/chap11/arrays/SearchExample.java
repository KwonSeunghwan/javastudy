package chap11.arrays;

import java.util.Arrays;

public class SearchExample {

	public static void main(String[] args) {
		// 기본타입값검색
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		// binarySearch 메소드를 사용하기 전에 배열이 먼저 정렬이 되어 있어야 한다.
		// 데이터의 갯수가 n개 있으면 검색시간이 log N만큼 걸린다.(밑을 2로 하는)
		// 8개 2의 3승 -> 어떤 데이터든지 3번이면 검색 가능하다.
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스:" + index);
		// 문자열검색
		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은 인덱스:" + index);
		// 객체검색
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = { m1, m2, m3 };
		// Member 객체가 Comparable 인터페이스를 구현하거나 Comparator 구현 객체를 제공
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스:" + index);

	}

}
