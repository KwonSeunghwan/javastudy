package chap07.exam.exercise7_1;

class SutdaDeck {
final int CARD_NUM = 20;
SutdaCard[] cards = new SutdaCard[CARD_NUM];
SutdaDeck() {
for(int i=0;i < cards.length;i++) {
int num = i%10+1;
boolean isKwang = (i < 10)&&(num==1||num==3||num==8);
cards[i] = new SutdaCard(num,isKwang);
}
}

	void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int j = (int) (Math.random() * cards.length);
			// cards[i]와 cards[j]의 값을 서로 바꾼다
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}

	SutdaCard pick(int index) {
		if (index < 0 || index >= CARD_NUM) // index . 의 유효성을 검사한다
			return null;
		return cards[index];
	}

	SutdaCard pick() {
		int index = (int) (Math.random() * cards.length);
		return pick(index); // pick(int index) . 를 호출한다
	}
}

// SutdaDeck

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

class Exercise7_2 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
