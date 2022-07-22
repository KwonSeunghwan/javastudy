package chap10.try_catch_finally;

// 예외처리 순서 : 범위가 작은 것으로 먼저 catch를 하고 
// 그 다음에 더 넓은 범위의 예외를 catch하는 것을 사용
// 1. ArrayIndexOutOfBoundsException : 특정한 유형의 예외를 잡는다.
// 2. RuntimeException : 모든 실행 예외를 붙잡을 수 있다.
// 3. Exception : 모든 예외를 다 붙잡을 수 있다.

public class CatchOrderExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];	// ArrayIndexOutOfBoundsException 발생 가능
			
			int value1 = Integer.parseInt(data1);	// NumberFormatException이 발생 가능
			int value2 = Integer.parseInt(data2);
				
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			// 친절하게 출력
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;	// finally문이 있을 경우, finally문으로 가서 실행 후 다시 돌아온다.
		} catch(RuntimeException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
