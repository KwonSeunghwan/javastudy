package chap06.static_member;

public class Calculator {
	// 정적 필드 : static 키워드를 사용 -> 메소드 영역의 클래스 Calculator에 존재한다.
	// 클래스 이름으로 접근할 수 있다.
	// 공통 데이터로 사용 - > 어디서든지 접근할 수 있다.
	staic double pi = 3.14159;
	// 인스턴스 필드
	int result;
	int value1;
	int value2;
	
	// 정적메소드
	static int plus(int x, int y) {
		return x + y;
	}
	static int minus(int x, int y) {
		return x - y ;
	}
}
