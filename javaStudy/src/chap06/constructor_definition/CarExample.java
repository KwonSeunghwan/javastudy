package chap06.constructor_definition;

public class CarExample {

	public static void main(String[] args) {
		// 여러가지 생성자를 이용해서 객체를 생성할 수 있다. 어떤 것을 초기값으로 설정할 것인가?
		Car car1 = new Car();
		Car car2 = new Car(4);
		Car car3 = new Car("그랜저");
		Car car4 = new Car(60, "에디슨 모터스");
		

	}

}
