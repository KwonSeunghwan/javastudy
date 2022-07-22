package chap03;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		int v1 = 10;		// 00000000000000000000000000001010
		int v2 = ~v1;		// 11111111111111111111111111110101
		int v3 = ~v1 + 1;	// 11111111111111111111111111110110
		System.out.println(toBinaryString(v1) + " (십진수: " + v1 + ")");	// 10
		System.out.println(toBinaryString(v2) + " (십진수: " + v2 + ")");	// -11
		System.out.println(toBinaryString(v3) + " (십진수: " + v3 + ")");	// -10
		System.out.println();

		int v4 = -10;		// 11111111111111111111111111110110
		int v5 = ~v4;		// 00000000000000000000000000001001
		int v6 = ~v4 + 1;	// 00000000000000000000000000001010
		System.out.println(toBinaryString(v4) + " (십진수: " + v4 + ")");	// -10
		System.out.println(toBinaryString(v5) + " (십진수: " + v5 + ")");	// 9
		System.out.println(toBinaryString(v6) + " (십진수: " + v6 + ")");	// 10
	}

	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);	// 0이 생략된다.
		while(str.length() < 32)				    // 생략된 0을 추가한다.
			str = "0" + str;
		return str;
	}
}