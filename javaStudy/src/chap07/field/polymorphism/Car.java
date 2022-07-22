package chap07.field.polymorphism;

public class Car {

	// 필드
	Tire frontLeftTire;
	Tire frontRightTire;
	Tire backLeftTire;
	Tire backRightTire;
	

	// 생성자
	public Car(Tire fl, Tire fr, Tire bl, Tire br) {
		this.frontLeftTire = fl;
		this.frontRightTire = fr;
		this.backLeftTire = bl;
		this.backRightTire = br;
	}
	
	// 메소드
	int run() {
		System.out.println("[자동차가달립니다.]");

		if (frontLeftTire.roll() == false) {
			stop(); return 1;
		};
		if (frontRightTire.roll() == false) {
			stop(); return 2;
		};
		if (backLeftTire.roll() == false) {
			stop(); return 3;
		};
		if (backRightTire.roll() == false) {
			stop(); return 4;
		}; return 0;
	}

	void stop() {
		System.out.println("[자동차가멈춥니다.]");
	}
}
