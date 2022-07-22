package chap04;

public class LoopExample {

	public static void main(String[] args) {
		/*
		 * 반복문 : 반복 실행
		 * for문, while문, do-while문
		 * for문 : 정해진 일정 횟수를 반복 실행할 때 많이 사용
		 * while문 : 무한반복하고 특정 조건에서 종료하고자 할 때
		 * do-while문 : 무조건 한번을 실행문을 실행할 때
		 * 
		 */
		
		// 1~100까지의 합을 구한다.
		int sum = 0;    // 합을 저장하기 위한 변수를 선언하고 초기치를 0으로 만든다.
		// 곱하기를 계속한다고 하는 경우는 초기치를 1로 한다. 1 * n = n
		// 0 * n = 0 -> n이 없어지므로 안된다.
		for(int i = 1;i <= 100;i++) {    // int i = 1 : 초기치를 설정
			// 실행문을 작성한다. (3번)
			// 1번 i : 인덱스 (i, j, k, l, m, n, ...) - 관습
			// 2번 i <= 100 : 조건식 (반복 여부를 결정) -. 조건식을 만족하면 실행문을 수행하고, 만족하지 않으면 
			// 반복문을 종료
			// 4번 i++ 증감식이라 하고 반복 수행문을 실행한 다음에 수행이 된다. -> 2번으로 다시 반복적으로 수행
			sum += i;
		}
		
      System.out.println("1~100까지 숫자의 합 = " + sum);  //5050
      
      // while문을 사용할 경우
      sum = 0;
      int j = 1;
      while(j <= 100) {
    	  sum += j;
    	  j++;
      }
      System.out.println("1~100까지 숫자의 합 = " + sum);  //5050
	}

}
