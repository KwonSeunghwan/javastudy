package chap06.access_modifier2;

import chap06.access_modifier1.ClassA;

public class ClassD {
	void method() {
		ClassA ca = new ClassA(10);
		ca.field1 = 10;			// public : OK
		ca.field2 = "홍길동"; 	// protected : 접근 불가능 -> 다른 패키지에 있는 클라스는 접근 불가능
		ca.field3 = 2.0L;		// default : 접근 불가능
		ca.field4 = 2.3;		// private : 접근 불가능
		
		// 메소드
		ca.method1();			// public만 OK
		ca.method2();
		ca.method3();
		ca.method4();
		
		
		// 생성자
		ClassA capro = new ClassA("홍길동");	// 접근 불가능
		ClassA cadef = new ClassA(20L);
		ClassA capri = new ClassA(5.4);
	}

}
