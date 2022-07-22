package chap06.constructor_this_call;

public class Car {
	// 필드
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 1
	Car(String model) {	// default 접근 제한자를 사용 : public 생략
		// 다른 생성자(생성자 3)를 재사용할 수 있다.
		this(model, "은색", 250);		// 생성자 3을 호출 : this -> Car 클래스
//		this.model = model;
//		// 다른 필드를 임의의 값으로 설정
//		color = "은색";
//		maxSpeed = 250;
	}
	// 생성자 2
	Car(String model, String color) {
		// 생성자 3을 호출 
		this(model, color, 250);	// 동일한 효과를 가진다. -> 많이 사용한다.
//		this.model = model;
//		this.color = color;
//		maxSpeed = 250;
	}
	// 생성자 3
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	
	}

}
