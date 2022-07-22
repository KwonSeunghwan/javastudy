package chap07.exam.exercise5;

public class Exercise5 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}

class Buyer {
	int money = 1000;	// 가진 돈
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product배열 cart에 사용될 index

	void buy(Product p) {	// p.price : 물건의 가격
		/*
		 * (1) 아래의 로직에 맞게 코드를 작성하시오. 
		 * 1.1 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다. 
		 * 1.2 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
		 * 1.3 장바구니에 구입한 물건을 담는다.(add메서드 호출)
		 */
		if(money < p.price) {	// 가진 돈이 부족하면
			// 실행 결과를 확인 하면서 답안을 작성해야 한다. 답 -> 복기
			System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
			return;	// 메소드를 종료
		} else { // 가진 돈이 충분하면
			money -= p.price;
			add(p);	// 장바구니에 넣기
		}
	}

	void add(Product p) {
		/*
		 * (2) 아래의 로직에 맞게 코드를 작성하시오. 
		 * 1.1 i의 값이 장바구니의 크기보다 같거나 크면 
		 * 1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다. 
		 * 1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다. 
		 * 1.1.3 새로운 장바구니와 기존의 장바구니를 바꾼다. 
		 * 1.2 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시킨다.
		 */
		// 빈 장바구니의 위치 : 비어 있는 장바구니가 없는 경우 (i == cart.length)
		if(i >= cart.length) {
			// 더 큰 장바구니를 만든다. -> 2배 큰 장바구니를 만든다.
			Product[] newCart = new Product[2* cart.length];
			// 기존의 장바구니를 새로운 장바구니로 복사하는 방법
			// 1. 반복문
			// System.arrayCopy -> 사용
			System.arraycopy(cart, 0, newCart, 0, cart.length);
			// Arrays.copyOf
			cart = newCart;
		}
		cart[i++] = p;	// 빈 장바구니 위치를 다음으로 위치 시킨다.
	} // add(Product p)

	void summary() {
		/*
		 * (3) 아래의 로직에 맞게 코드를 작성하시오. 
		 * 1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
		 * 1.2 장바구니에 담긴 물건들 가격을 모두 더해서 출력한다. 
		 * 1.3 물건을 사고 남은 금액(money)를 출력한다.
		 */
		// i = 빈 장바구니의 위치
		int pursuit = 0;	// 초기값
		System.out.print("구입한 물건:");
		for(int j = 0;j < i;j++) {
			System.out.print(cart[j] + ",");
			pursuit += cart[j].price;
		}
		System.out.println();	// 줄을 바꾸어 준다.
		System.out.println("사용한 금액 : " + pursuit);
		System.out.println("남은 금액 : " + money);
		
	} // summary()
}

class Product {
	int price; // 제품의 가격

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}