package chap07.inherit_introduction;

/* 메소드 재정의
 * 부모 클래스 : Airplane
 * 자식 클래스 : SuperSonicAirplane 초음속 비행기
 * 		모드 : 일반 비행 모드 -> 일반 비행 모드로 비행
 * 			   초음속 비행 모드  -> 초음속 비행 모드
 * 
 */
public class Airplane {	// 부모 클래스
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반비행 합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}

}
