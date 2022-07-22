package chap04;

public class GuGuExample {

	public static void main(String[] args) {
		// 중첩 for문 : for문 안에 for문이 있는 것 -> for문의 횟수는 제약이 없음
		// 데이터를 다루는 것을 같이 한다. ->배열을 사용
		// for문 -> 일차원 배열 -> 공간으로 비유하면 선에 해당
		// for문 안에 for문이 있는 경우 -> 이차원 배열 -> 공간으로 비유하면 면에 해당
		// for문이 3번 중첩되면 3차원 배열 -> 3차원 공간(x축, y축, z축)
		for(int i = 2;i < 10;i++) {       // 단 : i (2~9 반복)
			System.out.println(i + "단");
		
			for(int j = 1;j < 10;j++ ) {  // i * j : i단안에서 1~9까지 반복
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();    // 단과 단을 구별하기 위하여 빈줄을 추가
		}

	}

}
