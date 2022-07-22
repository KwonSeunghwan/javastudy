package chap10.try_catch_finally;

// Multi catch : 여러 개의 예외를 catch문을 사용해서 하나씩 예외처리를 할 수 있다.
public class CatchByExceptionKindExample {

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
			return;	// finally문이 있을 경우, finally 문으로 가서 실행 후 다시 돌아온다.
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
