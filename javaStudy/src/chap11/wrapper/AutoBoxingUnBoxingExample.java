package chap11.wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// Wrapper 클래스와 기본 데이터 타입간의 대입 : 상호 가능
		// 자동 Boxing
		Integer obj = 100;
		System.out.println("value:" + obj.intValue());
		
		// 대입시 자동 Unboxing
		int value = obj;
		System.out.println("value:" + value);
		
		// 연산시 자동 Unboxing
		int result = obj + 100;
		System.out.println("result:" + result);

	}

}
