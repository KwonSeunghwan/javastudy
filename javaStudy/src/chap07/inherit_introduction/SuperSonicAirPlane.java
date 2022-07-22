package chap07.inherit_introduction;

public class SuperSonicAirPlane extends Airplane {
	// 상수 비행모드 2가지를 상수로 정의
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	// 필드
	public int flyMode = NORMAL;	// 초기치 : 일반비행모드
	
	// 부모의 메소드를 재정의할 때 : 부모의 메소드를 호출할 수 있다.
	@Override
	public void fly() {	// 비행모드에 따라사 다르게 비행
		if(flyMode == SUPERSONIC) {	// 자식이 재정의함
			System.out.println("초음속 비행을 합니다.");
		} else {
			super.fly();	// 부모가 정의한 메소드를 호출	
		}
		
	}
}
