package chap03;

public class CompareExample {

	public static void main(String[] args) {
		// 비교 연산을 할 때 연산자의 타입이 서로 다른 경우 (부동소수점을 사용하는 경우) 주의를 해야 한다.
		// float, double -> 오차가 다르다. -> 피연산자를 통일을 하거나 아니면 정수로 변환을 하여 비교를 수행한다.
		int v2 = 1;
		double v3 = 1.0;    // -> 오차 없음
		System.out.println(v2 == v3);    //true
		
		double v4 = 0.1;    // -> 오차가 존재
		float v5 = 0.1f;
		// 컴퓨터에 저장된 형태대로 출력을 해본다.
		long l4 = Double.doubleToLongBits(v4);
		System.out.println(Long.toBinaryString(l4));     // 0 01111111011 1001100110011001100110011001100110011001100110011010 (52비트)
		int i5 = Float.floatToIntBits(v5);
		System.out.println(Integer.toBinaryString(i5));  // 0 01111011 10011001100110011001101 (23비트)
		System.out.println(v4 == v5);    // 오차가 다르다. -> float -> double -> false
		// 생각했던 결과가 안나온다. -> 오차가 다르기 때문에 -> float으로 변환을 해서 하거나, int로 변환
		// double로 변환하면 안되나? 원래의 double과 변환된 것이 다르게 된다. -> 다르다.
		
		// float으로 변환을 해서 비교
		System.out.println((float)v4 == v5);  // true
		System.out.println((int)(v4 * 10) == (int)(v5 * 10));  // true
		
		System.out.println(v4 == (double)v5); // false

	}

}
