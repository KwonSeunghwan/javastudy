package chap04;

public class BreakExample {

	public static void main(String[] args) {
		// Break문 - 반복문(블럭-범위)과 같이 사용
		// 범위(시작/끝)를 벗어나고자 할 때 사용
		// 구구단을 출력
		Outer : for(int i = 2;1 < 10;i++) { // i : 단
			System.out.println(i + "단");
			for(int j = 1;j < 10;j++) {
				System.out.println(i + " * " + j + " = " + i * j);
				// 2단이면 2*2까지만 출력, n단이면 n*n까지만 출력을 하고 나머지는 skip하고 싶다.
				if(i == j) {
					// 반복문을 벗어난다.
					break Outer;   // 나를 둘러싼 반복문 하나를 벗어나는 것
					// 밖에 있는 처음 for문 까지를 벗어나고 싶다.
				}
			}
			System.out.println();
		}

	}

}
