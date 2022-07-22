package chap07.inherit_introduction;

public class Calculator {	// 부모 클래스
	// 원의 면적을 계산하는 메소드
	double areaCircle(double r) {	// 원의 면적을 계산해서 반환
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;		// 원의 면적
		
	}

}
