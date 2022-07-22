package chap06.class_member;

public class CarExample {	// Car 클래스와 같은 패키지 내에 존재하는 클래스

	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		
		Car yourCar = new Car();
		System.out.println("회사 : " + yourCar.company);
		System.out.println("모델명 : " + yourCar.model);
		
		Car hongCar = new Car("그랜저");	// 생성자를 사용해서 model 정보를 초기화할 수 있음.
		System.out.println("모델명 : " + hongCar.model);
		System.out.println("회사 : " + hongCar.company);
		
		// 어느 차의 모델인지 모르므로 model1에 접근이 불가능
		model = "그랜저";	// 에러 -> CarExample 클래스의 필드로 생각한다.
		// 다른 클래스에서는 참조변수를 사용해서 접근해야 한다. : hongCar.model = "그랜저";
		
	}

}
