package chap10.exception_example;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 ="100";
		String data2 = "a100";	// 문자가 포함  -> 사용자가 잘못 입력, 시험자가 일부러 잘못 입력
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);

	}

}
