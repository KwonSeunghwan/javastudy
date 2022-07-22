package chap05;

// class와 같이 method 영역에 위치한다.
// MONDAY : 참조변수가 존재하고 heap 영역에 있는 MONDAY 객체의 주소를 저장하고 있다.
// TUESDAY : 위와 같음
//
// SUNDAY : 참조변수가 존재하고 heap 영역에 있는 SUNDAY 객체의 주소를 저장하고 있다.
public enum Week {	// Enum 클래스가 자동으로 상속이 된다.
	// 구성 요소를 나열한다.
	MONDAY,		// 대문자로 작성, 객체, 순서가 존재 (1)
	TUESDAY,	// 2
	WEDNESDAY,	// 3
	THURSDAY,	
	FRIDAY,
	SATURDAY,
	SUNDAY

}
