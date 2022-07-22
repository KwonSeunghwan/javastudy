package chap02;

// int -> double로 변환하는 것이 오차없이 사용할 수 있다.
public class FromIntToDouble {

	public static void main(String[] args) {
		// 오차없이 저장할 수 있는 가장 큰 수 : 16777216
		int num1 = 123456780;  // 16777216 보다 큰 수 -> 오차가 발생하지 않음
		int num2 = 123456780;
		
		// double은 가수가 52비트이므로 32비트짜리 int를 충분히 넣을 수 있다.
		double num3 = num2;    // 자동 타입 변환 : int -> double (오차가 발생하지 않음)
		num2 = (int) num3;    // 강제 타입 변환 : float -> int (손실이 발생할 수 있음)
		
		int result = num1 - num2;  // 오차가 없을 경우는 0이 된다.
		System.out.println(result);
	}

}
