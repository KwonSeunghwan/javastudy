package chap06.sec09.exam01_instance_member;

/*	Instance Member(인스턴스 멤버)
 *  객체를 생성했을 때를 말한다. -> 객체를 생성해야지 존재한다.
 *  
 *  -> 정적 멤버(static)와 구분하기 위해서
 *  정적 멤버는 static 키워드를 추가로 붙여준다.
 * 
 */

public class Car {
	// 필드
	String model;
	int speed;
	
	// 정적 멤버 : 정적 필드, 정적 메소드
	// static 키워드를 붙여준다.
	// 객체의 생성없이 존재한다.
	// 메소드 영역의 클래스에 존재한다. -> 공통으로 존재 (공통 데이터로 사용)
	// 클래스 이름으로 접근 가능
	// 정적 필드
	static String battery;
	
	// 생성자
	Car(String model) {
		this.model = model;
	}
	
	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 정적 메소드 : static 키워드를 붙여준다.
	// 메소드 영역에 존재
	// 클래스 이름으로 접근 할 수 없다.
	// 객체의 생성과는 무관하게
	
	static void changeBattery(String b) {
		// 정적 필드만 사용할 수 있음
		// 인스턴스 필드는 사용할 수 없다. ->: 객체가 생성 되어야만 의미가 있음.
		// 객체가 생성되어야만 존재하는 인스턴스 필드는 사용할 수 없다.
		battery = b;
	}
	
	// 가속을 해서 운행하는 메소드를 정의
	void run() {
		for(int i = 10;1 <= 50;i += 10) {	// 10씩 증가 : 10, 20, 30, 40, 50,
			setSpeed(i);
			System.out.println(model + "가 달립니다. (시속 : " + speed + "km/h");
		}
	}

}
