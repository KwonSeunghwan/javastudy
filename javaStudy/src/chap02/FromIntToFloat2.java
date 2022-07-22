package chap02;

// int -> float
public class FromIntToFloat2 {

	public static void main(String[] args) {
		// 오차없이 저장할 수 있는 가장 큰 수 : 16777216
		int num1 = 16777216;  // 16777216은 오차가 발생하지 않는다.
		int num2 = 16777216;
		
		float num3 = num2;    // 자동 타입 변환 : int -> float
		num2 = (int) num3;    // 강제 타입 변환 : float -> int (손실이 발생할 수 있음)
		
		int result = num1 - num2;  // 오차가 없을 경우는 0이 된다.
		System.out.println(result);
	}

}
