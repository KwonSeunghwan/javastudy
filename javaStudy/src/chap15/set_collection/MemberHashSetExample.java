package chap15.set_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberHashSetExample {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("홍길동", 25));
		set.add(new Member("홍길동", 25));
		set.add(new Member("강감찬", 30));
		System.out.println("집합의 크기 : " + set.size());
		Iterator<Member> iter = set.iterator();
		while(iter.hasNext()) {
			Member member = iter.next();
			System.out.println(member);
		}
		
		// Member 클래스의 hashCode()와 equals() 메소드를 재정의하지 않으면,
		// 같은 내용의 데이터가 중복 저장이 되어 있음.

	}

	

}