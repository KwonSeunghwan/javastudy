package chap14.rhamda_functional_interface;

public class MyMethodReferencesExample {

	public static void main(String[] args) {
		// 람다식을 작성한다
		// 왼쪽항 : 매개변수 
		// 오른쪽항 : 재정의된 메소드
		MyFunctionalInterface fi = () -> {
			// 실행문을 적어준다. -> 익명 구현 객체를 작성하는 것과 같다.
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {
			System.out.println("method call2");
		};
		fi.method();
		
		// 람다식의 실행문이 한 줄 일때는 중괄호를 생략할 수 있다.
		fi = () -> System.out.println("method call3");
		fi.method();

	}

}
