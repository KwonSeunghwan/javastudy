package chap06.class_member;

public class ClassMember {	// 클래스 
	// 구성 멤버 : 4가지(상수, 필드, 메소드, 생성자)
	
	// 상수 : 정해진 수 -> 일정한 수 (예) 차에서 최대속도, 최대로 넣을 수 있는 휘발유 양
	public static final int MAX_SPEED = 300;	// 300km
	public static final int MAX_GAS = 100;		// 100리터
	
	// 필드 : 상태정보, 특성, 부품(구성품) -> 관심있는 대상(정보)
	// 문제를 풀기 위해서 필요한 정보
	int speed;
	String model;
	String engine;	// 구성품
	String handle;	// 구성품
	String color;	
	
	// 생성자 -> 객체를 생성할 때 필드 값을 초기화 -> 어떤 필드를 초기화할 것인가에 따라 여러개가 존재
	public ClassMember() {	// 초기화하는 필드가 없음(매개변수로 초기화를 위한 필드를 받지 않음)
		speed = 20; // 보통은 초기화 하지 않음. 그러나 필요하면 초기화를 할 수 있음.
	}
	// 생성자
	public ClassMember(int s) {	// 매개변수로 받은 s로 필드 speed를 초기화
		speed = s;
	}
	
	// 생성자 : speed와 color를 생성시 초기화를 하고 싶다.
	public ClassMember(int s, String c) {	// 매개변수로 받은 값으로 필드를 초기화
		speed = s;
		color = c;
	}

	// 메소드 : 객체의 동작이나, 행위 -> 필드를 조작
	public void setSpeed(int s) {
		speed = s;
		System.out.println("현재 속도 : " + speed);
	}
	
	public int getSpeed() {	// 필드 정보를 반환 (현재 속도를 얻기 위하여 사용하는 메소드)
		return speed;
	}
}

class Engine {
	
}

class Handle {
	
}