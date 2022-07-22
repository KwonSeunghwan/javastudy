package chap06.access_modifier2;

import chap06.access_modifier1.ClassA;

public class ClassC extends ClassA {	// extends ClassA : ClassA를 상속한다.

	public ClassC(int field1) {	// 자식 ClassC의 생성자
		super(field1);	// 부모 생성자를 호출 : public 호출
	}
	
	public ClassC(String field2) {	
		super(field2);	// 부모 생성자를 호출 : protected 호출
	}
	
	public ClassC(long field3) {
		super(field3);	// 에러 발생 -> default 생성자는 접근 불가능
	}
	
	public ClassC(double filed4) {
		super(filed4);	// 에러 발생 -> private 생성자는 접근 불가능
	}
	
	void method() {			// 상속을 했으므로 부모의 필드를 가지고 있다.
		field1 = 10;		// public : OK
		field2 = "홍길동";	// protected : OK (상속을 받았으므로 접근 가능)
		field3 = 20L;		// default : 접근 불가능 -> 같은 패키지내에서만 접근 가능
			// ClassC는 다른 패키지에 있는 클래스이므로 접근 불가능
		filed4 = 1.1;		// private : 접근 불가능 -> 자신의 클래스에서만 접근 가능
		
		// 메소드에 접근
		method1();
		method2();
		method3();			// 접근 불가능
		method4();			// 접근 불가능
		
		// 생성자
//		ClassA capub = new ClassA(10);
//		ClassA capro = new ClassA("홍길동");	// 불가능
//		ClassA capub = new ClassA(10);
//		ClassA capub = new ClassA(10);
	}

}
