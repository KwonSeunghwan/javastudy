package chap02;

public class FloatExample {

	public static void main(String[] args) {
		float f1 = 9.1234567f;  // 소수 -> 32 bit : 부호 비트1, 지수 8 비트, 가수 23 비트
		//컴퓨터에 어떻게 저장되어 있는지 출력을 해보자.
		int i;  // 32 bit (같은 비트 수를 가진다.)
		i = Float.floatToIntBits(f1);     // float로 저장된 것을 int 형태로 저장함.
	    // 서식 형태로 출력할 때 print 메소드를 사용 : c언어
	    System.out.printf("%f\n", f1);    // system.out.println : '\n'을 붙여서 출력
	    // 부호 비트 0을 출력하기 위해서 0을 %앞에 써줌
	    System.out.printf("0%s\n", Integer.toBinaryString(i));  // 앞에 있는 0비트를 생략하지 않토록
		//
	    //System.out.println("안녕하세요");
		//System.out.println(10);
		float f2 = -9.1234567f;
		int j = Float.floatToIntBits(f2);
		System.out.printf("%f\n", f2);
		// %32s : 문자열(string s) 32개를 출력
		System.out.printf("%32s\n", Integer.toBinaryString(j));
	}

}
