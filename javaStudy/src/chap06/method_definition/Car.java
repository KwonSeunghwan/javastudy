package chap06.method_definition;

public class Car {
	// 필드
	String model;
	int maxSpeed;
	String color;
	String company;
	int speed;
	
	// 생성자
	// 메소드
	// 형식 : 접근제한자 반환형 메소드이름(매개변수, ...) { 실행문... }
	public void setspeed(int speed) {	// 반환형 : void (없음) -> return 문이 없어도 된다.
		this.speed = speed;
		return /* 데이터가 없음 */;	// 메소드의 종료를 의미(return문에서 메소드의 실행을 종료)
	}
	
	public int getSpeed() {		//반환형 : int -> return문이 있어야 한다.
		// retrun문이 없어서 에러 발생
		return speed;	// 현재 속도를 반환 -> 반환형에 맞추어 주어야 한다.
	}
	
	// 메소드 오버로딩 : 메소드의 시그너쳐가 다르면 여러 개를 허용
	// 생성자 오버로딩 : 시그너쳐가 다르면 여러 개를 허용
	void method() {
		byte b1 = 10;
		short s1 = 20;
		int i1 = 30;
		long l1 = 40l;
		float f1 = 60.6f;
		double d1 = 70.0;
		// 메소드를 호출 : println() 메소드를 호출
		// 매개변수의 타입이 각각 다르다.
		// 메소드 오버 로딩의 전형적인 예이다. -> 시그너쳐 중에서 타입이 다르다.
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		
	}
	
	// C언어는 메소드 오버로딩이 존재하지 않음 -> 메소드 이름을 다르게 해야 한다.
	// 같은 이름의  add 메소드가 존재 : 매개변수의 시그너쳐가 다른 것(타입, 갯수, 순서)을 정의할 수 있음 -> 메소드 오버로딩
	int add(int num1, int num2) {
		return num1 + num2;
	}

	long add(long l1, long l2)	{
		return l1 + l2;
	}
	
	float add(float f1, float f2) {
		return f1 + f2;
	}
	
	double divide(double d1, double d2) {
		return d1 / d2;
	}
	
	int sub(int i1, int i2) {
		return i1 - i2;
	}
}
