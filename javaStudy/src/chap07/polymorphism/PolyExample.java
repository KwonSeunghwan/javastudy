package chap07.polymorphism;

public class PolyExample {

	public static void main(String[] args) {
		A a1 = new B();	// 직계
		A a2 = new D();	// 직계
		B b1 = new D();	// 형제간은 안됨
		C c1 = new E(); // 사촌간은 안됨 -> 직계만 대입이 가능
		

	}

}
