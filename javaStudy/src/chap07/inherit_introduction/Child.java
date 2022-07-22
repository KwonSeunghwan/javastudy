package chap07.inherit_introduction;

public class Child extends Parent { // extends 키워드를 사용 : 상속하고자 하는 부모 클래스를 지정한다.
		// 자바에서는 부모 클래스를 한 개만 상속할 수 있다.
		// interface 구현한다. (implements 용어를 사용) -> 여러 개를 구현 가능
		// 부모 클래스를 상속하면 부모 클래스의 필드와 메소드를 가진다. : field1, method1()
		// 나만의 멤버를 추가 할 수 있다.
		// 필드를 추가
	int field2;
	
	// 생성자
	// default 생성자 -> 생략 가능
	public Child() {	// 자식이 생성되기 전에 부모가 먼저 생성이 되어야 한다.
		// 자식은 부모의 멤버를 가지므로 자식이 생성되기 전에 부모가 먼저 생성이 된다.
		super();		// super : 부모를 지칭. super() : 부모 생성자 -> 생략 가능
	}
	
	// 메소드 추가
	void method2() {
		System.out.println("method2()를 실행함");
	}

}
