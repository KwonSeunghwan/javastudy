package chap06.method_definition;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int numArr[] = { 20, 25, 30 };
		int sum = cal.add(numArr);
		System.out.println("합 : " + sum);	// 75
		
		int sum2 = cal.add(new int[] { 20, 25, 30 });
		System.out.println("합 : " + cal.add2( 10, 20, 30 ));	// 가변 매개변수 : 매개변수의 수가 변할 수 있다. -> 지원을 하는 방법
		System.out.println("합 : " + cal.add2( 10, 20, 30, 40));
		System.out.println("합 : " + cal.add2( 10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
		
		add2(10, 20);	// add2?????

	}

}
