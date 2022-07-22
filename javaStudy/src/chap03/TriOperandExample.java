package chap03;

public class TriOperandExample {

	public static void main(String[] args) {
		// 삼항식 : 항이 3개
		// 형식   : (조건)? 참일때 수행문 : 거짓일때 수행문;
		// if else문 보다 간결하게 하나의 열로 표현하고자 할 때 사용
		int i1 = (3 > 5)? 3 : 5;    // 거짓
		System.out.println(i1);     // 5
		
		// if/else
		int value = 3;
		if(value > 5)  {
			i1 = 3;
		} else {
			i1 = 5;
		}
		
		int value2 = 10;
		// 복잡하지만 사용할 때가 있다.
		// 그러나 삼항식 형식을 따르므로 주의를 하면 된다.
		int result = (value > 3)? ((value2 < 10)? 10 : 20) : - 20;
		if(value > 3)  {
			if(value2 < 10)  {
				result = 10;
			} else { 
				result = 20;
			}
		} else {
			result = -20;
		}
	}

}
