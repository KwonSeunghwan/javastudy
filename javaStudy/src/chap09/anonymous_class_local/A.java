package chap09.anonymous_class_local;

public class A {	// 외부 클래스
	// 익명 객체를 사용
	Parent field = new Parent() {
		// 자식 클래스가 추가한 필드, 메소드
		int field1;			// 익명 객체 내에서만 사용
		void method2() {	// 익명 객체 내어서만 사용			
			System.out.println("자식이 추가한 메소드");
		}
		
		// 부모 Parent 클래스의 메소드를 재정의
		void parentMethod() {
			System.out.println("제정의 함");
			field1 = 20;	// 부모가 정의한 메소드 내에서 사용
			method2();		// 부모가 정의한 메소드 내에서 사용
		};
	};
	
	void method() {
		// field로 접근 할 수 있는 것 -> 부모 Parent가 정의한 것만 접근 가능
		field.parentMethod();
		// 자식이 추가한 필드나 메소드에는 접근 할 수 없다. 왜냐하면 나는 Parent 타입이므로
		field.field1 = 20;
		field.method();
		// 자식 타입으로 강제 타입변환을 해야 하는데, 클래스 이름이 없으므로 강제 타입 변환을 할 수 없다.
	}

}

class Parent {
	void parentMethod() {
		System.out.println("Parent:parentMethod()");
	}
}