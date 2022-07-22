package chap07.exam.exercise7_22;

public class Exercise7_22 {
	
	/*
	(1) sumArea 메서드를 작성하시오
	*/
	

	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("면적의 합 :"+ sumArea(arr)); 

	}
	
	 // sumArea() 메소드를 정의 : 3개의 도형에 대한 면적을 합산
	static double sumArea(Shape[] arr) {
		// 주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환
		double areas = 0.0;
		for(Shape s : arr) {
			areas += s.calcArea();
//			System.out.println(areas);
		}
		return areas;
		
	}

}

class Circle extends Shape {
	double r;	// 반지름
	
	// 생성자 : 원점을 기준으로 하는 원
	Circle(double r) { 
		// 부모 생성자 호출
		this.r = r;
	}
	
	// 생성자 : Point p를 기준으로하는 원
	Circle(Point p, double r) {
		super(p);
		this.r = r;
	}
	
	// 원의 면적을 계산
	@Override
	double calcArea() {
		return Math.PI * r * r;	// 
	}
}

class Rectangle extends Shape {
	// 멤버 변수
	double width;
	double height;
	
	// 생성자
	
	// 생성자 : 원점을 기준으로 하는 사각형
	Rectangle(double width, double height) {		    
		this.width = width;
		this.height = height;
	}						
	// 생성자 : Point P를 기준으로 하는 사각형
	Rectangle(Point p, double width, double height) {	
		super(p);
		this.width = width;
		this.height = height;
	}
	
	// 메소드
	boolean isSquare() {	// 정사각형(true)인지 아닌지(false)를 알려준다.
		// 추가로 정의
//		if (width != 0 && width == height ) {
//			return true;
//		} else {
//			return false;
//		}
		
		return width != 0 && width == height;
		
			
		
	}

	// 사각형의 면적을 계산하는 메소드
	@Override
	double calcArea() {
		return width * height;
	}
}

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}