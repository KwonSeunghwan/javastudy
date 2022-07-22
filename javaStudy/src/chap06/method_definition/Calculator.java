package chap06.method_definition;

public class Calculator {
	// 매개변수로 배열을 받아서 더하기를 하는 메소드
	int add(int[] numArr) {		// int[] numArr와 같은 혁활 -> + 가변을 지원
		int sum = 0;
		for(int value : numArr) {	// 배열에 있는 값들을 반복해서 더한다.
			sum += value;
		}
		return sum; 
	}
	// 가변 매개변수를 지원하는 방법 : int...numArr
	int add2(int...numArr) {
		int sum = 0;
		for(int value : numArr) {
			sum += value;
		}
		return sum;
	}
	
	void method2() {
		int sum = add2(10, 20);
	}
	
	// 필드
	int gas = 100;
			
	// 메소드		
	boolean isLeftGas() {	// 반환형이 있으면 return문이 있어야 한다.
		if(gas == 0) {
			System.out.println("가스가 없습니다.");
			return false;	// return 문이 존재 <- gas가 0일때만 의미가 있음.
		} else if(gas > 0) {	// gas가 0이 아닐 때 실행된다.
			// return문이 없으므로 에러 -> 여기서도 return 문이 존재해야 한다.
			System.out.println("가스가 있습니다.");
			return true;
		} //else {	// else를 사용하지 않아도 이상이 없음. 왜냐하면 위의 두가지 조건을 만족하지 않으면 실행
			return false;	// 발생할 수 있는 모든 조건에서 return문이 존재해야 한다.
			// 값을 반환(1)하고 종료(2)
		//}
	}
	
	void method() { // 반환형이 없는 메소드
		if(gas > 0) {
			return /* 반환형이 없으므로 반환할 것이 없음 */;	// 이때는 메소드가 종료된다.
		}
		System.out.println("남아 있는 가스의 양 : " + gas);
	}
}
