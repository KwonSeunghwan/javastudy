package chap03;

public class CheckOverflowExample {

	public static void main(String[] args) {
		/* 연산을 할 때 Overflow가 발생할 수 있다. 
		 *
		 */
		
		int x = 1000000;
		int y = 1000000;
		
		int result = x * y;  // 12자리 -> 원하는 결과가 도출이 안됨
		System.out.println("int로 출력할 수 있는 최댓값:" + Integer.MAX_VALUE);  // 10자리, 21억
		System.out.println("result:" + result);
		
		// 프로그램은 직접 계산을 할 수도 있지만 -> 원하는 결과가 도출되지 않음 (잘못된 결과가 나올 수 있음) 
		// 값의 범위를 판단하거나 
		// 직접 계산하지 않고 메소드를 사용해서 처리 -> 메소드 내에서 여러가지 프로그램으로 검사를 할 수 있다.
		
		try {   // try*catch문에서 예외 처리를 함
			int result2 = safeAdd(2000000000, 2000000000);
			System.out.println(result2);}
			catch(ArithmeticException e) {
				System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");  // 사용자에게 알림
			}
		}
        // 비정상적인 경우를 검사를 한다.
		public static int safeAdd(int left, int right)  {
			// Integer.MIN_VALUE <= left + right <= Interger.MAX_VALUE -> OK 정상
			// 위의 경우가 아니면 비정상적인 결과가 도출된다.
			// left >= INTEGER>MIN_VALUE - right : OK
			// left <= INTEGER.MAX_VALUE - right : OK
			
		}
			if(right > 0) {
				if(left > Integer.MAX_VALUE - right)  {  // left + right > Integer.MAX_VALUE : NOK
					throw new ArithmeticException("오버 플로우가 발생")  // 예외를 발생 시킴
					// throw : 예외처리를 dateAdd 메소드를 호출한 곳에서 처리를 하도록 던저버림(요청함)
					// throw를 하면 메소드가 종료됨
				}
				else { // 정상(OK))
		}	else { // right : 0 또는 음수
			     if(left < Integer.MIN_VALUE - right) {  // left + right < Interger.NIN_VALUE : NOK
			    	 throw new ArithmeticException("오버 플로우가 발생")  // 예외를 발생 시킴
				     // throw : 예외처리를 dateAdd 메소드를 호출한 곳에서 처리를 하도록 던저버림(요청함)
			    	 // throw를 하면 메소드가 종료됨
			    } else {    // 정상 : OK
			    	return left + right;
			    }
		}
		return left + right;    // 위의 두 가지에 대하여 공통으로 처리를 함
	}

}
