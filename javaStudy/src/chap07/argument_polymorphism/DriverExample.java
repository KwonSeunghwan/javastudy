package chap07.argument_polymorphism;

// 새로운 운송수단을 추가하면
// 새로운 객체를 추가하고
// 변경되는 객체는 DriverExample 클래스만 변경된다.
// Drriver 클래스는 변경되지 않는다.

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Bus();
		driver.drive(vehicle);		// 버스가 달립니다.
		driver.drive(new Taxi());	// 택시가 달립니다.
		driver.drive(new Motorcycle()); // 모터사이클이 달립니다.

	}

}
