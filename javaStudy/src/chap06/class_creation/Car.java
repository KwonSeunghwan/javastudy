package chap06.class_creation;

// main() 메소드가 있는 클래스 -> 실행 클래스 -> JVM 실행할 수 있다.
// main() 메소드가 없는 클래스는 독자적으로 실행 할 수 없고 라이브러리로 사용
// 즉 , 다른 클래스가 호출해서 사용한다.
public class Car {	// 모든 클래스의 부모 클래스는 Object 클래스이다.
	// Car 클래스는 Object 클래스를 상속 받은 것이다. (표기를 생략함 -> 명시하지 않아도 규칙임)
	int speed;		// 속도
	String model;	// 모델명
	String company;	// 제조회사

	public static void main(String[] args) {
		Car myCar = new Car();	// new 연산자를 사용해서 객체를 생성 -> 구체적인 실체를 만든다.
		// heap 영역에 데이터 저잘할 수 있는 공간이 생긴다.
		myCar.speed = 60;		// 참조변수(구체적인 실체를 가리키는 변수)를 사용해서 속도를 설정
		myCar.model = "소나타";	// 참조변수를 사용해서 모델명을 설정
		myCar.company = "현대자동차";
		System.out.println("현재 속도 : " + myCar.speed);
		System.out.println("내차의 모델명 : " + myCar.model);
		System.out.println("내차의 제조자 : " + myCar.company);
		
		// myCar, brotherCar : 참조변수 -> 객체를 가리키는 변수 -> 참조변수를 통해서만 객체에 접근 가능
		Car brotherCar = new Car();	// 형제의 차 -> 인스턴스화(하나의 객체 생성)
		brotherCar.speed = 120;
		brotherCar.model = "S100";
		brotherCar.company = "BMW";
		System.out.println("현재 속도 : " + brotherCar.speed);
		System.out.println("형제의 차 모델명 : " + brotherCar.model);
		System.out.println("형제의 차 제조사 : " + brotherCar.company);
		System.out.println(brotherCar);	// 참조변수를 출력 -> 참조변수가 가리키는 객체를 출력
		// 참조변수를 출력하면 Object 클래스의 toString() 메소드를 호출 -> 클래스 이름과 주소를 출력

	}

}
