package chap07.exam.exercise7_1;

class SutdaDeck { // 화투통
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	// 생성자
	SutdaDeck() {
		/* (1) SutdaCard . 배열 를 적절히 초기화 하시오 */
		// SutdaCard를 20장을 만들어서 SutdaDeck에 넣어야 한다.
		for (int i = 0;i < cards.length; i++) { // 20장 반복
			// i : 0~19 -> i를 이용해서 num을 만들어야 한다.
			// 0 ~ 9 : 1, 3, 8 -> 광
			// 10 ~19 : 1, 3, 8 -> 알맹이(5끗, 10끗)
			int num = i % 10 + 1; // 1~10 (0->1, 10->1
			boolean isKwang = (i < 10 && (num == 1 || num == 3 || num == 8)); // 1, 3, 8 : 광
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
}


class SutdaCard {
	int num;
	boolean isKwang;

	// default 생성자 : 1K
	SutdaCard() {
		this(1, true);
	}

	// 생성자
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// 모든 클래스는 Object 클래스를 상속
	// Object toString() 메소드가 존재
	// info() 대신 Object클래스의 toString()을 오버라이딩했다
	// System.out.println(dog); dog.toString()을 출력한다.
	public String toString() { // 클래스의 정보 출력하는 메소드
		return num + (isKwang ? "K" : "");
	}
}

public class Exercise7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
	}
}

