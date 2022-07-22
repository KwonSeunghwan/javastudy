package chap04.exam;

/*
 * [4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
 */
public class Exercise4_2 {

	public static void main(String[] args) {
		// 합을 저장하는 변수가 필요
		int sum = 0;
		for(int i = 1; i <= 20;i++) {    // 1부터 20까지의 정수 : 반복문
			// 1~20
			// 2의 배수 : 수를 2로 나누어서 나머지가 0인 수
//			if(!(i % 2 == 0 || i % 3 == 0)) {
			if(i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
         System.out.println("합 : " + sum);    // 출력
	}

}
