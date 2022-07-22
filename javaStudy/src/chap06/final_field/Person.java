package chap06.final_field;

/*
 * final : 최종, 초기화가 된 이후에 변경 불가능
 * 한 번 값이 정해지면 변경을 할 수 없도록 하고자 할 때 final 키워드를 붙여준다.
 * 초기화 방법
 * 1. 필드 선언 시
 * 2. 생성자로 초기화
 */

public class Person {
	// 상수 : static, final
	// 변경 풀가능
	// 상수이름은 대문자록 작성
	// 두개 이상의 단어를 사용할경우 '+'로 연결
	// 생성자를 초기화할 수 없음
	// 이름은 의미 있는 단어를 사용 -> 이름만 보면 어떤 것인지 알수 있도록 작명을 하는 것이 좋다.
	public static final String KOREA = "Korea";
	public static final String CITY = "seongnam";
	public static final String LOGIN_SUCCEESS = "login succeess";
	public static final String ADDRESS;
	// 다른 데이터를 조합해서 값을 초기화하고자 할 때 static 블럭을 사용
	static {	// static 블럭을 사용해서 static final을 초기화할 수 있다.
		ADDRESS = KOREA + CITY;
		
	}
	// 필드 
	final String nation = "Korea"; // 필드 선언과 함께 초기화
	final String ssn;	// 주민등록번호  -> 에러 발생 (초기화를 하지 않아 발생) ->
						// 생성자로 초기화하면 에러가 발생하지 않음
	String name;
	
	// 생성자를 사용해서 final을 초기화할 수 있다.
	public Person(String ssn, String name) {
		this.ssn = ssn; // final // final 필드를 초기화
		this.name = name;
	}

	void method() {
		
		nation = "미국"; // 에러 발생 0> final은 불가능
	}
}
