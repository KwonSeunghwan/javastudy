package chap06.static_member;

public class CalculatorExample {

	public static void main(String[] args) {
		// 정적 멤버는 클래스 이름으로 접근 가능
		int x = 10;
		int y = 20;
		// 
		int sum = Calculator.plus(x, y);
		double radius = 5.0;
		// 클래스 이름을 사용해서 접근 -> 어디서든지 접근할 수 있다.
		double area = Calculator.pi * radius * radius;
		
		// 인스턴스 필드 -> 객체가 생성되어야만 의미
		Calculator myCal = new Calculator();	// 객체 생성
		myCal.value1 = 10;	// 참조변수를 사용해서 접근할 수 있다.
		// 정적 필드를 접근 : 참조변수를 사용해서 접근을 할 수있다. -> Calculator.pi 사용해라
		System.out.println("pi = " + myCal.pi);	// 정적 필드는 어떤 인스턴스에만 있는 것이 아니므로 
			// myCal.pi -> 인스턴스 필드인 것처럼 사용하지 마라.
		System.out.println("pi=" + Calculator.pi); 	// -> 바람직하다.
		int result = myCal.Plus(10, 20);		// -> 바람직하지 않은 사용법
				

	}

}
