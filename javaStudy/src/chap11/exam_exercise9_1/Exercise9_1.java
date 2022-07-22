package chap11.exam_exercise9_1;

public class Exercise9_1 {

	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		System.out.println("c1=" + c1);	// c1 = 3k
		System.out.println("c2=" + c2); // c2 = 3k
		// 논리적 동등 비교 -> equals() 메소드를 재정의를 해둔다.
		System.out.println("c1.equals(c2):" + c1.equals(c2));	// true
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public boolean equals(Object obj) {
		/*
		 * (1)  매개변수로 넘겨진 객체의 num, isKwang과 
		 * 멤버변수 num, isKwang을 비교하도록 오버라이딩 하시오 .
		 */
		
		// SutdaCard 형태로 형변환
		if(obj instanceof SutdaCard) {
			SutdaCard card = (SutdaCard)obj;
			return num ==card.num && isKwang == card.isKwang;
		}
		
		return false;
		
	}

	public String toString() {
		return num + (isKwang ? "K" : "");

	}

}
