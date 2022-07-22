package chap07.abstract_class;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}

	// 추상 메소드는 반드시 재정의를 한다.
	@Override
	public void sound() {
		System.out.println("멍멍");

	}

	// breath() 메소드는 재정의할 필요가 없음.
	// 필요하면 재정의한다.
}
