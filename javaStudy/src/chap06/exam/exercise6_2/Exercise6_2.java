package chap06.exam.exercise6_2;

public class Exercise6_2 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());	// 3
		System.out.println(card2.info());	// 1k
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	// 생성자 2개 
	public SutdaCard() {	// 1K가 저장되도록 만든다.
		this(1, true);		// 1K -> 아래에 정의된 생성자를 호출
	}
	
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info()
	String info() {	//3, 1K
//		if(isKwang) { // 광이면
//			return num + "K";
//		} else {
//			return "" + num;
//		}
		
		// 삼항식을 사용하여 간단하게 출력하면 좋겠다.
		return num + (isKwang? "K" : "");
	}
    /*
	 * (1) . 알맞은 코드를 넣어 완성하시오
	 */
}
