package chap09.anonymous_class;

public class Kildong extends Person {	// 부모 클래스 Person을 상속
	// 부모의 메소드를 재정의
	@Override
	public void wake() {
		System.out.println("8시에 일어납니다.");
		gotoInstitute();
	}
	
	// 자식 클래스의 메소드를 추가
	private void gotoInstitute() {
		System.out.println("학원에 갑니다.");
	}

}
