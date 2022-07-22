package chap06.static_member;

public class Television {
	// 정적 필드 -> 공통 데이터
	// static 멤버는 메소드영역에 존재
	static String company = "Samsung";	// 초기화
	static String model = "LCD";		// LCD, OLED
	static String info;		// 초기화
	
	static {	// 정적 블럭( '{', '}' 중괄호로 둘러싼 부분 -> 초기화할 때 사용된다.
		// 클래스가 메소드 영역에 로딩이 될 때 위에서부터 아래로 순서적으로 실행이 된다.
		info = company + "-" + model;	// 초기화 : 위에 있는 static 필드를 이용하거나 "
			// 정적 메소드를 이용할 수 있다.
		}

}
