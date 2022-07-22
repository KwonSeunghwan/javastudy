package chap06.exam.exercise6_7;

public class Exercise6_7 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		// p (2,2) . 와 의 거리를 구한다
		System.out.println(p.getDistance(2, 2));
	}
}

class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/*
	 * (1) getDistance . 인스턴스메서드 를 작성하시오
	 */
	// 메소드 : 반환형 메소드 이름 매개변수 { 실행 부분 }
	// 자신의 좌표값과 매개변수로 주어진 좌표값 사이의 거리를 계산하는 메소드
	double getDistance(int x1, int y1) { 	// (x, y), (x1, y1,)
		double result = Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
		return result;
	}
	
	
	double getDistance(MyPoint p2) { 	// (x, y), (x1, y1,)
		double result = Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
		return result;
	}
	
	
}
