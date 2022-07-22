package chap06.annotation_creat;

public class Service {
	@PrintAnnotation		// 입력 파라미터를 모두 default 값을 사용
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*")	// 출력하는 문자를 '*'로 설정
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(value="#", number=20)	// #을 20개 출력
	public void method3() {
		System.out.println("실행 내용3");
	}

}
