package chap04.exam;

/*
[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라.
  	(1)에 알맞은 코드를 넣으시오 
  Math.random() : 0~1사이의 double 값이 발생
  0 <= dice < 1 소수
  * 6 : 0 <= 6 * dice < 6
  * 6 + 1 : 1 <= 6 * dice + 1 < 7 -> (int) 강제 형변환을 해주면 1~6
  1~6 사이의 임의의 정수
 */
public class Exercise4_7 {

	public static void main(String[] args) {
		// 주사위의 눈금을 만드는 방법
		// 홀짝
		// 가위 바위 보
		// 카드
		double d1 = Math.random();
		double d2 = d1 * 6;
		double d3 = d2 + 1;
		int value2 = (int)d3;
		
		int value = (int)(Math.random() * 6 + 1);
		System.out.println("value:" + value);

	}

}
