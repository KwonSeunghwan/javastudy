package chap14.rhamda_functional_interface;

public class MyMethodReferencesExample3 {

	public static void main(String[] args) {
		// 람다식을 사용하는 방법
		MyFuntionalInterface3 fi = (int x, int y) -> {			
			int result = x + y;
			return result;	// 반환형
		};
		System.out.println(fi.method(10, 20));
		
		// 람다식의 규칙 : 데이터 타입은 생략 가능
		fi = (x , y) -> { return x + y; };
		System.out.println(fi.method(20, 30));
		
		// 실행문이 한줄일 때는 return을 생략할 수 있다.
		fi = (x, y) -> x + y;
		System.out.println(fi.method(100, 200));
		// 매개 변수의 수가 2개 이상 일때는 매개변수의 ()를 생략할 수 없다.

	}

}
