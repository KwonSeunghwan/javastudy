package chap07.inherit_introduction;

public class FinalMethod {	// 부모 클래스
	void method1() {
		System.out.println("method1() 실행됨");
	}
	
	final void method2() {	// final 키워드를 사용
		System.out.println("method2() 실행됨");		
	}

}
