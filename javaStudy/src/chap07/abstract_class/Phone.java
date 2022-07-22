package chap07.abstract_class;

/*
 * 추상클래스
 * 여러가지 객체의 공통돤 특성을 모아놓은 클래스
 * 구체화할 수 없고, 규격화(필드 정의, 생성자, 메소드도 정의)
 * 추상클래스를 상속한 클래스가 구체화를 한다.
 * 객체를 생성할 수 없다. -> 구체화가 안되어 있으므로
 * 추상 메소드를 가지고 있다. -> 형식만 정의하고 실행부가 없는 메소드
 * 추상 메소드가 없을 수도 있다. 기본 틀만 만들었기 떄문에 상속받은 클래스가 재정의를 한다.
 * abstract 키워드를 사용
 */
public abstract class Phone {
	// 필드
	public String owner;
	
	// 생성자 
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메소드 : 공통되는 메소드만 정의
	public void turn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	// 필요에 따라서 재정의를 하지 않아도 된다.
	public void turnoff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	// 추상 메소드를 가질 수 있다. -> 실행문이 없음
	// abstract 키워드를 사용 -> 상속받은 클래스가 반드시 재정의를 한다.
	// 상속받은 클래스가 추상 메소드를 재정의를 하지 않으면 상속받은 클래스가 추상 클래스가 된다.
	public abstract void setVolume(int volume);	// 형식만 정의

}
