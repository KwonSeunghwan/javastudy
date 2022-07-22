package chap07.exam.abstract_exam;

public abstract class Unit {
	int x, y;	// 현재 위치
	
	// 추상 메소드 : 각 클래스마다 동작이 다르므로 형식만 정의 -> 수행부분
	abstract void move (int x, int y);	// 반환형, 메소드 이름. 매개변수
	void stop() {	//  실행부 -> 각 클래스별로 재정의 없이 기본 동작을 정의한다.
		/* 현재 위치에 정지*/
	}

}
