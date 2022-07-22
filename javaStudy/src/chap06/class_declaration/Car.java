package chap06.class_declaration;

public class Car {	//클래스 이름은 대문자로 시작, 파일 이름과 동일 -> 접근 제한자가 public
	// 파일 이름과 동일한 클래스는 public 접근 제한자를 사용 가능.
	// public 접근 제한자 : 어떤 클래스든지 접근할 수 있다.

}

class Tire {	// Car.java내에 정의된 Tire 클래스 -> 접근 제한자로 default를 사용 
	// public 접근 제한자를 사용자를 사용할 수 없음. default 접근제한자만 사용 가능
	// 접근 제한자가 없는 것 : default -> 같은 패키지에 있는 클래스만 접근 가능
}