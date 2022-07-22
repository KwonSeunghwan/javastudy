package chap06.sec06_exam01_field_declartion;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();	// 객체를 생성 (실체가 있어야 접근할 수 있다.)
		System.out.println("제작회사 : " + myCar.company);	// 참조변수를 사용해서 필드에 접근
		System.out.println("속도 : " + myCar.speed);
		myCar.maxSpeed = 60;
		System.out.println("변경된 속도 : " + myCar.maxSpeed );

	}

}
