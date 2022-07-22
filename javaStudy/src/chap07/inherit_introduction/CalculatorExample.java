package chap07.inherit_introduction;

public class CalculatorExample {

	public static void main(String[] args) {
		Computer computer = new Computer();	// 자식
		computer.areaCircle(5.5);	// 부모의 areaCircle() 호출하는가?
			// 자식의 areaCircle()을 호출하는가? -> 자식이 재정의한 메소드를 호출

	}

}
