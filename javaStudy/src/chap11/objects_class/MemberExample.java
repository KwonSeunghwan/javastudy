package chap11.objects_class;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1 == obj2) {		// 물리적으로 같은 객체인지 비교  obj1:blue, obj2:blue
			System.out.println("물리적으로 같은 객체 입니다.");
		} else {
			System.out.println("물리적으로 다른 객체 입니다.");	// 출력
		}
		// equals() 메소드가 ==와 같은 동작을 한다.
		if(obj1.equals(obj2)) {	// 논리적으로 같은 객체인지 비교
			System.out.println("논리적으로 같은 객체 입니다.");
		} else {
			System.out.println("논리적으로 다른 객체 입니다.");	// 출력
		}
		
		if(obj1.equals(obj3)) {	// 논리적으로 같은 객체인지 비교
			System.out.println("논리적으로 같은 객체 입니다.");
		} else {
			System.out.println("논리적으로 다른 객체 입니다.");	// 출력
		}

	}

}
