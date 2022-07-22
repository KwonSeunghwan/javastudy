package chap06.access_modifier1;

public class ClassA {
	// 필드
	public int field1;
	protected String field2;
	long field3;	// 접근제한자를 적지 않을 때
	private double field4;
	
	
	// 생성자 
	public ClassA(int field1) {	// 생성자 오버로딩 : 시그너쳐(타입, 갯수, 순서)
		this.field1 = field1;
	}
	protected ClassA(String field2) {
		this.field2 = field2;
	}
	ClassA(long field3) {
		this.field3 = field3;
	}
	private ClassA(double field4) {
		this.field4 = field4;
	}
	
	// 메소드
	public void method1() {
		System.out.println("method1() 실행됨");
	}
	protected void method2() {
		System.out.println("method2() 실행됨");
	}
	void method3() {
		System.out.println("method3() 실행됨");
	}
	private void method4() {
		System.out.println("method4() 실행됨");
	}
	
	void method5() {		// 같은 클래스에서 접근(사용)
		field1 = 10;		// ok (접근가능)
		field2 = "홍길동";	// ok (접근가능)
		field3 = 10L;		// ok (접근가능)
		field4 = 5.5;		// ok (접근가능)
		
		method1();			// ok
		method2();
		method3();
		method4();
	}
	

}
