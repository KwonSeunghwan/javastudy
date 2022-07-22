package chap04.exam;

/* 
 *  int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 
 *  만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. 
 *  (1)에 알맞은 코드를 넣으시오.
		[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
 */
public class Exercise4_10 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		/*
		(1) . 알맞은 코드를 넣어 완성하시오
		*/
		
		// 10으로 나누었을때 나머지를 구한다.
		// 나머지 5
		// 12345 / 10 = 1234
		// 나머지를 구하면 4를 곱한다.
		do {
			sum += num % 10;
			num /=10;
		} while(num != 0);
		System.out.println("sum="+sum);

	}

}


