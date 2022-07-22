package chap10.exception_example;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Animal animal = new Dog();
//		if(animal instanceof Cat) {	// 예외 방지
			Cat cat = (Cat)animal;	// Dog - > Cat : ClassCastException 발생
//		}
		System.out.println("프로그램이 더 실행된다.");	
		// 일반적으로 상용 프로그램은(은행, 통신사 응용 프로그램)은 1년 365일 24시간 장애없이 계속 성장 실행
		// 이 되어야 한다. 예외가 발생하더라도 종료되선 안된다. -> 예외처리를 한다. 계속 프로그램을 실행
		// 예외 처리 : 운영자나 개발자에게 예외 원인을 알린다(로그를 남긴다).
	}

}

class Animal {
	
}

class Dog extends Animal {
	
}

class Cat extends Animal {
	
}
