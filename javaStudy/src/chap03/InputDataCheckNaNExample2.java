package chap03;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";    //문자열로 입력을 받아
		double val = Double.valueOf(userInput);  // 문자열을 double 변환 (NaN : Not a Number)
		double currentBalance = 1000030;         
		System.out.println(currentBalance);      // NaN + 소수 = NaN이 된다. -> 잔고가 무한대가 됨
	}

	// 손님 입장에서는 NaN 입력했으므로 성공
	// 은행원 입장에서는 이런 경우를 방지
	// 개발자는 역시 방지를 해야 한다. -> 개발자가 벌금을 물어줄 수 있음
	// NaN 인지를 검사하여 처리 필요
}
