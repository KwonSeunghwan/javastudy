package chap07.polymorphism;

public class AnimalExample {

	public static void main(String[] args) {
		Animal animal1 = new Animal();	// 부모 객체를 생성
		Cat cat2 = animal1;	// 부모를 자식에 대입 불가 -> 강제 타입 변환하면 가능한 것처럼 보이지만 에러 발생
							// ClassCastException 발생
		
		animal1.sound();	// 부모 클래스의 sound() 메소드가 실행되고 " 소리를 냅니다." 출력
		
		Dog dog1= new Dog();
								// Animal 클래스를 상속 ( Animal 클래스의 sound(), Dog이 재정의한 sound()가 존재.)
		dog1.sound();			// 뭐가 호출될까요? - > 자식 객체가 재정의한 메소드가 호출
								// 다양성을 지원하기 위하여  규칙
		

		// 다양성의 첫번째 조건
		Animal animal2 = new Dog();	// 부모 클래스에 자식 클래스를 대입
			// 자식 클래스가 부모 클래스를 상속했으므로 부모 클래스의 특성을 가지고 있으므로
		animal2.sound();	// 부모 크래스의 sound()가 호출되는가? 자식 클래스의 sound()가 호출되는가?
			// 다향성을 지원하기 위하여 자식 클래스의 sound()가 호출된다. (두번째 조건)
		Dog dog3 = (Dog)animal2;	// 강제 타입 변환
		animal2 = new Cat();
		animal2.sound(); 	// 야옹 소리를 냅니다.
		// 다형성 : 부모 타입에 어떤 자식 객체를 대입하는가에 따라 자식 객체의 특성이 나는 것 -> 다형성
	}

}
