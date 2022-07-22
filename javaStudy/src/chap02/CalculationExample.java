package chap02;

public class CalculationExample {

	public static void main(String[] args) {
		// 산순 연산을 할 때 자동 타입 변환이 발생하는 경우
		int intValue = 10;
		double doubleValue = 5.5;
        double result = intValue + doubleValue;
        // int + double = double + double로 자동 타입 변환이 발생
        // 왜냐하면 CPU는 동일한 레지스터를 사용해야 하며, 큰 데이터 타입을 담을 수 있는 레지스터를 사용한다.
        // 32비트, 64비트 짜리 레지스터가 있는데 64비트를 사용한다.
        // 그래서 32비트 int 데이더틀 64비트 레지스터에 저장하는 것을 자동 타입 변환이 발생하는 것으로 간주
        
        byte b1 = 10;
        byte b2 = 20;
//        byte b3 = b1 + b2;  // 에러 발생
        // b1 + b2는 CPU 내부에서 32비트 레지스터를 사용해서 저장하고 더하기 동작이 이루어진다.
        // byte가 int로 자동 타입 변환이 이루어지고 
        // 더한 결과는 int가 된다. (byte가 아니다.) -> 바이트에 저장할 수 없다.
        byte b4 = (byte)(b1 + b2);  // 강제 타입 변환을 하면 저장할 수 있다. : int -> byte
        short s1 = 234;
        short s2 = 453;
//        short s3 = s1 + s3; //에러 발생 s1 +s2는 int이므로)
        
        // 평균을 구할 때
        int eng = 90;
        int math = 89;
        int kor = 98;
        
        int sum = eng + math + kor;  // 총점
        double avg = sum / 3;  // int / 3(int) = int (92) -> 소수점 이하가 없어진다.
        System.out.println("총점 : " + sum);  // 277
        System.out.println("평균 : " + avg);  // 92.3x
        // double을 결과를 얻으려면 64비트 레지스터를 사용해야 하고, 둘 중의 하나를 double을 사용해야 한다.
        avg = sum / 3.0;    //int / double = double / double = 277.0 / 3.0
        System.out.println("평균 : " + avg);

	}

}
