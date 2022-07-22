package chap04;

public class ContinueExample {

	public static void main(String[] args) {
		// Continue문 : 반복문과 같이 사용됨
		/* 반복문 (조건식) {
		 *        실행문 1;
		 *        if(조건) {
		 *            실행문 2는 생략하고 계속 반목문을 실행하고 싶다.
		 *            continue문을 사용.      
		 *        }
		 *        실행문 2;
		      }        
		 */
		// 구구단을 출력
		int i;
		for(i = 2;i <10;i++) {
			System.out.println(i + "단");
			if(i %2 == 0) {    // 짝수단
				// 출력하지 않고 싶다.
				continue;    // 이하의 실행문은 수행하지 않음, 다음 반복문을 실행하기 위해 i++로 이동
			}
			int j;
			for(j = 1;j < 10;j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
        // 반복문이 종료되고 나서 변수 i를 사용하고 싶을 때
		System.out.println("\ni = " + i);
	}

}
