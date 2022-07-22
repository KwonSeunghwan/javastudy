package chap09.member_class_usage_limit;

public class A {	// Outer 클래스
	// 인스턴스 멤버 -> 객체 A개 생성되어야만 존재
	int field1;
	void method1() { }
	
	// 정적 멤버 -> 객체 A의 생성과는 무관하게 존재
	static int field2;
	static void method2() { }
	
	// 인스턴스 멤버 클래스
	class B {
		void method() {	// 객체 A가 존재하고 객체 B가 존재할 때 동작
			field1 = 20;
			method1();
			field2 = 30;
			method2();
			
		}
	}
	// 정적 멤버 클래스
	static class C {
		// 인스턴스 메소드  -> 객체 C가 생성되어야 존재
		void method() { // 시점 : 클래스 A는 생성 되지 않아도 된다.
			// 클래스 A의 인스턴스 멤버에는 접근 불가능
			field1 = 30;	// 에러
			method1();		// 에러
			// 클래스 A의 정적 멤버는 접근이 가능
			field2 = 40;
			method2();
			
		}
	}
	
	// 자바 버전 7에서는 final 키워드를 붙여주었어야 함
	// 자바 8부터는 final 키워드를 생략 가능
	void method3(int arg) {
		final int localVariable = 1;
		// arg와 localVariable은 final 동작을 하고, 수정할 수 없음
//		arg = 30;	// 에러 발생 -> 수정 불가능 -> final이므로 
//		localVariable = 30;	// 에러 발생 -> final로 동작 -> 수정 불가능
		// 로컬 클래스
		class Inner {
			public void method4() { // 의도 : method3에서 주어진 값을 method4에서 그대로 사용하고자 함
				// 경우 :  method3의 매개변수와  로컬 변수를 method4에서 사용하는 경우 
				int result = arg + localVariable;
			}
		}
		Inner inner = new Inner();
		inner.method4();
	}

}
