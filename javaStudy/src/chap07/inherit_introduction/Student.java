package chap07.inherit_introduction;

public class Student extends People {	// 부모 클래스인 People을 상속 받음
	// 필드 
	public int studentNo;	// 학번
//	// 생성자
//	public Student() {		// default 생성자
//		super();			// 부모의 default 생성자를 호출 -> 생성자 없음 -> 에러
//	}
	
	// 생성자
	public Student(String name, String ssn) {
		super(name, ssn); 	// 부모의 생성자를 호출할 수 있음
	}
	
	public Student(String name, String ssn, int studentNo) {
		// super : 부모 클래스를 의미
		// this : 자기 자신 Student 클래스를 의미
			super(name, ssn); 	// 부모의 생성자를 호출할 수 있음 -> 부모의 생성자를 호출해야 함
		// 부모 생성자로 default 생성자를 사용하고 싶으면, 부모 클래스에 default 생성자를 추가한다.
			this.studentNo = studentNo;
	}

}
