package chap10.try_catch_finally;


public class MultiCatchExample {

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
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			// 친절하게 출력
			// 두 개 중에 어느 예외가 발생했는지 알수 없음.
			// 공통된 예외처리를 한다. -> 바람직하지 않고 하나씩 예외처리를 하는 것이 좋다.
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 붙잡을 수 없습니다.");
		} catch(Exception e) {
			System.out.println("알 수 없는 예외 발생");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
