package chap15.set_collection;

public class Member {
	public String name;	// 이름
	public int age;		// 나이
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	
	// 논리적 동등 비교를 위해서  hashCode()와 equals() 메소드를 재정의 하지 않았을 때
	@Override
	public int hashCode() {
		// name : 문자열 -> 내용이 같으면 같은 hashCode() 값을 가진다.
		int value = name.hashCode() + age;
		System.out.println("hashCode=" + value);
		return value;	// 이름과 나이가 같으면 동일한 hashCode()가 생긴다.
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {	// Member 객체이면
			Member m = (Member)obj;
			return age == m.age && name.equals(m.name); // 나이와 이름을 비교
		}
		return false;	// Member 객체가 아니면 false를 반환
	}
}
