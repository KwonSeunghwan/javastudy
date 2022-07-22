package chap07.abstract_class;

public class AnimalExample {

	public static void main(String[] args) {
		// 다형성 : 상속관계 추상클래스와 상속받은 클래스
		Animal animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();

	}

}
