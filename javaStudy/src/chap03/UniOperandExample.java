package chap03;

/*
 *  단항연산자
 *  부호연산자 : +, -
 *  결과는 int 형태가 된다. -> CPU내에서 32 bit Register로 동작하기 떄문
 *  iong -> iong
 */
public class UniOperandExample {

	public static void main(String[] args) {
		short s1 = 100;
//		short s2 = -s1;  // 에러 발생 : -s1은 int이다. int -> short 손실이 발생하므로 에러
		int i1 = -s1;    // int에 저장해야 한다.
		short s3 = (short)-s1; // 강제 타입 변환를 해주어야 한다.
		
//		short s4 = +s1;  // 에러 발생 : +s1도 int이다. (CPU내에서 32bit로 동작을 하므로)
		// + -> 1을 곱한 것과 같다.
		// - -> -1일을 곱한 것과 같다. (메모리에 있는 데이터를 CPU로 읽어와야 한다. 이때 32비트 레지스터에 저장됨)
		
		// 증감연산자 : ++, --
		int x1 = 10;
		int x2 = 10;
		int y = x1++ + 10;  // 변수 뒤에 증감연산자를 위치          // x1=10
		// 변수 뒤에 증감연산자 있을 경우, 먼저 +연산이 이루어지고, 이후에 x1이 증가된다.
		System.out.println("x1=" + x1 + ", y=" + y);    // x1=11, y=20(x1=10)
		System.out.println();
		
		int y2 = ++x2 +10;  // 변수 앞에 증감연산자를 위치          // x2=11, y=21
		// 변수 앞에 증감연산자가 있을 경우, 먼저 x1이 증가되고, 그 이후에 +연산이 이루어진다.
		System.out.println("x2=" + x2 + ", y2=" + y2);
		
		// -- : 위치에 따라서 동작원리는 ++와 같다.
		int x3 = 10;
		int x4 = x3;
		int y3 = x3-- +10;    // y3=20, x3=9
		System.out.println("y3=" + y3 + ", x3=" + x3);
		int y4 = --x4 + 10;   // y4=19, x4=9
		System.out.println("y4=" + y4 + ", x4=" + x4);
		
		// 논리 부정 연산자 (!)
		boolean flag = true;
		System.out.println(!flag);  // false
		
		// 비트 반전 연산자 (~) 틸트 : 1의 보수를 구하는 것과 같다.
		// 각 비트의 값이 0이면 1로, 1이면 0으로 반전시키는 것
		// 음수 : 양수의 2의 보수 = 1의 보수 +1
		int i100 = 10;         // 00000000 00000000 00000000 00001010
		int inverse = ~i100;   // 11111111 11111111 11111111 11110101
		System.out.println(~i100);  // -11
		
		// 원리는 같다. CPU내에서는 Register 32 bit를 사용한다.
		byte b1 = 10;
		byte b2 = ~b1;  // 에러 발생 : ~b1은 int
		b2 = (byte)~b1; // 강제 타입 변환을 해야 한다.
		int i101 = ~b1;
		
	}

}
