package chap06.static_member;

public class ClassA {
	// 인스턴스 필드 -> 객체가 생성되어야만 존재
	 int field1;
	 // 인스턴스 메소드
	 void method1() {
		 System.out.println("method1() 실행됨");
	 }
	 
	 // 정적 필드와 메소드 -> 객체의 생성없이 존재
	 static int field2;
	 static void method2() {
		 System.out.println("method() 실행됨");
	 }
	 
	 static {	// 정적 블럭 -> 객체의 생성없이 존재 -> 메소드 영역에 로딩될 때 순서대로 실행된다.
		 // 인스턴스 멤버를 사용할 수 있는지? -> 사용 불가
		 field1 = 10;	// 에러 발생 -> 인스턴스 필드는 사용 불가
		 method1();		// 인스턴스 메소드를 호출할 수 없음
		 // 객체가 생성되고 나서 참조변수를 통해서 접근 가능 -> 의미 없음
		 ClassA ca = new ClassA();
		 ca.field1 = 30;
		 ca.method1();
		 
		 // 정적 멤버는 사용할 수 있는가? -> 사용 가능
		 field2 = 30;
		 method2();
	 }
	 
	 // staric 블록과 같은 경우
	 static void method3() {
		 field1 = 30;	// 에러 -> 사용 불가
		 method1();		// 에러 -> 사용 불가
		 field2 = 30;	// 사용 가능
		 method2();		// 사용 가능 
	 }

}
