package chap04.exam;

/*
 * [4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
 * 홀수 : +
 * 짝수 : -
 * 1씩 증가 
 * 종료 조건 : 합이 100이 되면 종료
 */
public class Exercise4_4 {

	public static void main(String[] args) {
		// 합
		int sum = 0;
		int i;
		for (i = 1;; i++) {
			// 종료조건이 더하기 전에 할 것인가? 뒤에 할 것인가?

			if (i % 2 == 0) {	// 짝수
				sum += -i;
			} else {			// 홀수
				sum += i;
			}

			if (sum == 100) {	// 합을 구한 다음 그 값이 100인 i를 구해야 하므로, 합을 구한 다음에 종료한다.
				break;
			}

		}
		System.out.println("합 = " + sum + ", i = " + i);

	}
}
