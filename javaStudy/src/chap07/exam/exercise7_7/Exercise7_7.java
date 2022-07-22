package chap07.exam.exercise7_7;

public class Exercise7_7 {	//호출되는 생성자의 순서와 실행 결과를 적으시오.

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x=" + c.getX());
		
		/*	생성자 순서
		 * Child()
		 * Child(int x)
		 * Parent()
		 * Parent(int x)
		 * 
		 */
	}

}

class Parent {	// (3)
	int x = 100;
	Parent() {
		this(200);
	}

	Parent(int x) {	// (4)
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {		// (1)
		this(1000);
	}

	Child(int x) {	// (2) : 부모 생성자를 호출
		super();	// 생략 가능
		this.x = x;
	}
}
