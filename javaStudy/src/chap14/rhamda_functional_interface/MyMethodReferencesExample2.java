package chap14.rhamda_functional_interface;

public class MyMethodReferencesExample2 {

	public static void main(String[] args) {
		// 람다식 사용
		MyFuntionalInterface2 fi = (int x) -> {
			// 실행문을 작성
			int result = x +5;
			System.out.println(result);
		};
		fi.method(5);
		
		// 람다식의 규칙 : 매개변수가 한개만 있을 때 매개변수의 타입은 생략 가능
		fi = (x) -> {
			System.out.println(x + 5);
		};
		fi.method(10);
		
		// 람다식의 규칙 : 매개변수가 한 개이면, ()를 생략 가능 
		fi = x -> System.out.println(x + 5);
		fi.method(20);

	}

}
