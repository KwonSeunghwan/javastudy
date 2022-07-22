package chap11.arrays;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = { 99, 97, 98 };
		// 정렬
		Arrays.sort(scores);	// 기본 데이터 타입을 저장하는 배열을 정렬 -> 오름차순으로 정렬
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores["+i+"]="+scores[i]);
		}
		System.out.println();
		
		// 문자열 배열
		String[] names = { "홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		for(int i=0; i <names.length; i++){
		System.out.println("names["+i+"]=" + names[i]);
		}
		System.out.println();
		
		// Member 객체를 저장하는 배열 -> Member 객체가 Comparable 인터페이스를 구현해야 한다.
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members={m1,m2,m3};
		// 방법1
		Arrays.sort(members);	// Comparable 인터페이스를 구현한 객체일 경우 정렬 방법
		// 방법2
		// Comparable 인터페이스를 구현하지 않은 객체를 정렬할 때 -> Comparator 구현객체를 제공해야 한다.
		// Arrays.sort(member, /* Comparator 구현객체를 사용*/);
		for(int i=0; i <members.length; i++){
			System.out.println("members["+i+"].name="+members[i].name);
			
		}
	}
}