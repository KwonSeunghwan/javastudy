package chap03;

public class LogicalOperandExample {

	public static void main(String[] args) {
		// 논리 연산자 : &&, &(AND), ||, |(OR), ^(NOR), !(Not)
		// 논리곱(AND) : 두가지 조건을 모두 만족을 해야 한다. T(A) T(B) -> T
		// - A가 false면 B가 true인지 false인지에 관계없이 false가 된다.
		// && : A가 false이면 B가 true인지 false인지 판단을 하지 않는다.
		// &  : A가 false이더라도 B가 true인지 false인지를 판단을 한다.
		
		int a = 1;
		int b = 2;
		
		// A : (a = 4 + 4) < 0 false
		// B : (b = 3 + 3) > 0
		// A && B
		if((a = 4 + 4) < 0 && (b = 3 + 3) > 0) {
			System.out.println("a=" + a + ", b= + b");
		} else {    // 실행
			System.out.println("a=" + a + ", b= + b");  // a=8, b=2
		}
		
		
		int a2 = 1;
		int b2 = 2;
		
		// A : (a2 = 4 + 4) < 0 false
		// B : (b2 = 3 + 3) > 0
		// A && B
		if((a2 = 4 + 4) < 0 & (b2 = 3 + 3) > 0) {  // b2 = 3 + 3이 실행된다.
			System.out.println("a=" + a2 + ", b= + b2");
		} else {    // 실행
			System.out.println("a=" + a2 + ", b= + b2");  // a=8, b=6
		}

	}

}
