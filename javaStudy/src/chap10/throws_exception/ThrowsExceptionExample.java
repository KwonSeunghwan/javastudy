package chap10.throws_exception;

public class ThrowsExceptionExample {

	public static void main(String[] args) {
//		method2();
//		try {
//			method3();	// 예외가 발생되므로 예외 처리를 해주어야 한다.
//		} catch (ClassNotFoundException e) {
//			System.out.println("클래스가 존재하지 않습니다.");
//		}
		
		// 계속 던지면, JVM이 콘솔에 스택 트레이스를 출력한다. 예외 처리를 한다.
	}
	
	// 예외 처리를 하지 않고, 나를 호출한 메소드에서 예외 처리를 하도록 요구할 수 있다. -> 예외 떠 넘기기
	// throws 던질 예외 클래스
	private static void method3() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}	

	private static void method2() {
		// 없는 클래스이므로 ClassNotFoundException 발생
		// 예외가 발생된 곳에서 예외 처리를 하는 경우
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
		
	}

}
