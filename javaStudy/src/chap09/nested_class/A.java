package chap09.nested_class;

// 실행되는 시점을 잘 생각해 본다.
public class A {		//Outer(외부) 클래스
	// 인스턴스 멤버 클래스 -> 객체 A가 생성되어야만 존재
	class B { }
	
	// 정적 멤버 클래스
	static class C { } // -> 객체 A의 생성과는 무관하게 존재
	
	// 인스턴스 필드 -> 객체 A가 생성 되어야만 의미 -> 객체 A가 생성됨
	B field1 = new B();	// OK
	C field2 = new C(); // OK
	
	// 인스턴스 메소드
	void method1() {	// method1() 실행되는 시점은 객체 A가 생성됨
		B var1 = new B();	// OK
		C var2 = new C();	// OK
	}
	
	// 정적 필드 -> 객체 A의 생성과는 무관하게 존재(동작)
	static B filed3 = new B();	// 에러 -> 클래스 B는 인스턴스 멤버 클래스 이므로 객체 A가 생성되어야 존재
	static C filed4 = new C();	// OK -> 클래스 C가 정적 멤버 클래스 이므로 객체 A의 생성과는 무관함
	
	// 정적 메소드
	static void method2() {	// 객체 A의 생성과는 무관하게 동작 가능
		// 인스턴스(X), 정적(O)
		B var1 = new B();	// 에러 
		C var2 = new C();	// OK
	}

	

}
