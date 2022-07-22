package chap07.casting;

public class CastingExample {

	public static void main(String[] args) {
		// 자동타입변환
		Parent parent = new Child();	// 부모 타입 = 자식 타입
		// parent 타입이 접근할 수 있는 범위 -> parent가 정의한 것만 보인다.(사용할 수 있다.)
		parent.field1 = 20;	// Parent가 정의한 필드
		parent.method1();	// Parent 정의한 메소드
		parent.method2();	// Child가 정의한 메소드(재정의) -> 다형성
		// 원래 생성한 객체는 Child이다. -> Child가 추가한 필드와 메소드에 접근하고 싶다.
		// 강제타입변환 -> Child 타입이 된다. <- 강제타입변환이 가능한 이유는 원래 생성된 것이 Child이므로 가능함
		Child child = (Child)parent;
		// Child가 추가한 필드와 메소드에 접근할 수 있다.
		child.field2 = 20;
		child.method3();
		// 원래 처음에 생성한 객체가 Child 이기 때문에...
		
		// 문제는 원래 생성한 객체가 Parent일 때 
		Parent p2 = new Parent();
		Child c2 = (Child)p2;	// OK -> 실행 시 예외가 발생 -> Parent를 child로 변경 불가.
		// ClassCastException 발생됨
		// 강제 타입을 할 때 원래 생성한 객체가 Parent인지? Child인지 확인할 필요가 있다.
		// instanceof를 사용
		if(p2 instanceof Child) {	// 원래 생성한 객체가 Child인지 확인
			// Child 객체인 경우 강제타입 변환을 한다.
			c2 = (Child)p2;
		} else { 
			// 강제타입변환을 하지 않는다. -> 예외가 발생하므로 
		}

	}
}
