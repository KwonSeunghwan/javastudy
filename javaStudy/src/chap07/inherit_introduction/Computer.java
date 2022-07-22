package chap07.inherit_introduction;

public class Computer extends Calculator {	// 자식 클래스
	// 부모의 메소드를 가지고 있다 : areaCircle()
	// 1. 부모가 정의한 메소드를 그대로 사용
	// 2. 나만의 방법으로 재정의하여 사용한다.
	
	// 재정의 : @Override
	// 특징 : 부모의 반환형, 메소드 이름, 매개변수가 동일하다.
	// @Override 어노테이션을 사용했으므로 부모의 메소드에 형식을 따르는지를 검사를 한다. -> 에러 표시를 함
//	@Override	// @Override 어노테이션 사용 -> 부모의 메소드를 재정의 -> 컴파일러에게 알린다.
	double areaCircle(float r) {// 메소드 오버로딩으로 간주하여 새로운 메소드임
		// TODO Auto-generated method stub
	return super.areaCircle(r);
		//return 	// Math 라이브러리를 사용 원의 면적을 계산 -> 재정의
	}
	
	// @Override를 생략하도 된다.
	double areaCircle(double r) {	// 재정의한 것과 같다. -> 생략 가능
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;	// super : 부모(Calculator)
		// 부모의 메소드를 재정의 하지 않으면 부모의 메소드가 실행된다.
	}
	

}
