package chap15.map_collection;

// 키로 사용되는 객체

public class Student {
	public int sno;	   	// 학번 -> Student를 고유하게 식별하는 식별자
	public String name;	// 이름
	
	// 생성자
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	
	// 키값으로 사용되려면 논리적 동등 비교를 구현해야 한다. -> hashCode(), equals() 재정의
	// 재정의 하지 않았을 때
	// 재정의 할 때
	// Student 클래스에 sno 필드가 고유하지 않다면, sno와 name 두 개를 모두 비교해야 한다.
	
	@Override
	public int hashCode() {
		return sno;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return sno == s.sno;	// 고유한 값인 sno가 같으면 동일한 학생으로 간주
		}
		return false;
	}

}
