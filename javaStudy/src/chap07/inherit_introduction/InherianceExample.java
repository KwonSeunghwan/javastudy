package chap07.inherit_introduction;

public class InherianceExample {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.field1 =10;	// 부모의 필드를 사용
		p1.method1();	// 부모의 메소드를 사용
		
		Child c1 = new Child();
		c1.field1 = 20;	// 부모의 필드에 접근
		c1.field2 = 30; // 자식이 추가한 필드에 접근
		c1.method1();	// 부모가 정의한 메소드를 사용
		c1.method2(); 	// 자식이 추가한 메소드를 사용
	}

}
