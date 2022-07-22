package chap07.field.polymorphism_array;

public class Car {

	// 필드
	Tire[] tires;
	

	// 생성자
	public Car(Tire...tires) {	// 매개변수의 갯수를 모를 때 (Tire[] tires)
		this.tires = tires;
		
	}
	
	// 메소드
	int run() {
		System.out.println("[자동차가달립니다.]");
		for(int i = 0;i < tires.length; i++) {
			if(tires[i].roll()==false) {
				stop();
				return(i+1);
			}
		
		}; return 0;
	}

	void stop() {
		System.out.println("[자동차가멈춥니다.]");
	}
}
