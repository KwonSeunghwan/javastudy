package chap08.interface_definion;

// InterfaceAImpl : 구현 객체
// implements 키워드를 사용하고 구현하고자 하는 인터페이스 명을 붙여준다.
// 여러 개 구현할 수 있다. (필요한 기능을 추가한다.)
// 추상 메소드를 재정의해주어야 한다. (구현 객체는 구현할 목적 implement 하였으므로)
// 추상 메소드를 구현하지 않으면 추상 메소드가 되고, 추상 클래스가 된다.
public class InterfaceAimpl implements InterfaceA {

	// 추상 메소드 -> 재정의
	@Override
	public void method1() {
		System.out.println("추상 메소드를 재정의한다.");
	}

}
