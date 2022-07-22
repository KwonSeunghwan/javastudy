package chap02;

public class LiteralExample {

	public static void main(String[] args) {
		// 리터럴 : 프로그램내에서 데이터를 사용하는 것 -> 변수와 약간 다르다. 같은 점은 데이터
		// 데이터 유형 : 정수(byte, short int long), 실수(float, double), 
		// 문자(char), 문자열(string), 논리형(boolean)
		/* 표현방법
		 * 정수
		 * 이진수
     	 */
		
		// 정수
		// default 값은 int(32비트) 10진수
		int i1 = 0b011010000;    // 이진수 : 0b로 시작 (b : binary, 이진수)
		int i2 = 0123;           // 8진수(octal) : 0으로 시작 (사용할 수 있는 숫자는 0~7만 사용)
		int i3 = 08;             // 에러 : 8은 8진수에서 사용할 수 없는 수
	    int i4 = 123;            // 10진수 (0~9)
	    int i5 = 0x345abc;       // 16진수 (hexadecimal) : 0~9, a(10)~f(15), 대소문자 구별 없음
	    long l1 = 234L;          // 끝에 L(대문자 엘)또는 l(소문자 엘)을 붙여준다. -> 64비트(8바이트)
	    
	    // 실수 : float, double(default)
	    double d1 = 3.14;    // 소수점
	    float f1 = 4.5;      // 에러 (default가 double이므로 float 32비트에 64비트 double을 저장할 수 없음)
	    float f2 = 2.6f;     // 끝에 대문자 F 또는 소문자 f를 붙여준다. (32비트)
	    float f3 = 3.1E-5F;  // 지수 표현도 가능
	    double d2 = 0.54E10;
	    
	    // 문자 리터럴 : char (2바이트(16비트) 크기)
	    char c1 = 'a';       // 하나의 문자 : 홑 따옴표로 둘러싼다.
	    char c2 = '강';       // 한글 2바이트를 저장 가능
	    char c3 = '\u3456';   // UTF-8 unicode를 사용(hexa값이 사용됨)
	    // hexadecimal 1자는 4비트를 차지(nibble)
	    char c4 = '\n';        // 이스케이프 문자 : 모니터나 프린터와 같은 IO 장치를 제어를 하는데 사용
	    // '\n' 모니터에서 커서를 다음 줄로 변경하는 제어 문자
	    // '\t' : 탭(전체가 8글자를 차지 : 2글자면 6개의 빈칸을 띄워준다.)
	    
	    // 출력할 때
	    System.out.println("출력할 내용을 적어준다.");
	    // 이클립스에서는 system.out.println을 자주 사용하므로 단축 키를 제공한다.
	    // sysout을 입력하고 control-space를 치면 자동 완성해준다.
	    System.out.println("\"");    //출력하고자 하는 문자열에 "를 포함할 경우 에러 발생
	    // 문자열은 쌍따옴표로 시작하고 쌍따옴표 끝나야 한다. 위는 쌍따옴표가 하나 부족함 (시작, 끝, 시작) -> 끝이 없음
	    // " 이 문자열의 시작과 끝이 아니라 출력하고자 하는 문자라는 것을 구별하기 위하여 \을 앞에 붙여준다.
	    System.out.println('\'');    // 문자의 시작과 끝을 나타내는 홑따옴표 문자 '를 구변하기 위하여 \을 붙여준다.
	    System.out.println('\\');    // escape 문자가 아니라 '\'를 출력하기 위하여 구별하기 위하여 \를 붙여줌
	    
	    // 문자열 리터럴
	    String str1 = "안녕하세요.";    // 쌍따옴표로 둘러산 것
	    String str2 = "안녕하세요.";    // 안녕하세요는 두 번 저장되는 것이 아니고, 한 번만 저장이 된다. (물리적으로 같음)
	    
	    // 논리 리터럴 
	    boolean b1 = true;           // 1바이트이며, true 또는 false
	    boolean b2 = false;          // true 또는 false -> 리터럴

	}

}
