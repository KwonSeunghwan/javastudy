package chap06.method_definition;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setspeed(60);	// 메소드를 호출
		double result = myCar.divide(10.0, 5.2);
		result = myCar.divide(10, 2);	// 매개변수로 int를 사용 -> 매개변수로 double을 사용 
										// 자동 타입 변환을 허용한다. double이 int를 저장할 수 있으므로
		// 강제타입변환은 허용하지 않음 -> 손실이 발생할 수 있으므로
		int r1 =myCar.sub(10.0, 20.0);	// 에러 발생 : 매개변수가 int 인데, double을 대입
		// 큰 데이터 타입을 작은 데이터 타입에 대입할 때는 손실이 발생함으로 에러 발생

	}

}
