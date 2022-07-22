package chap09.anonymous_class;

public class AnonymousExample {

	public static void main(String[] args) {
		// Anonymous 생성자의 매개변수에 익명 객체를 대입
		Anonymous a = new Anonymous(new Person() {
			// 익명 객체의 정의부
			@Override
			public void wake() {
				System.out.println("5시에 일어납니다.");
				exercise();
			}
			
			private void exercise() {
				System.out.println("운동을 합니다.");
			}
		});
		a.method1();	// 생성자로 대입한 객체가 실행됨
		
		a.field.wake(); // 생성자가 대입한 객체가 실행됨
		a.method2(); 	// 로컬 변수에 대입된 익명 객체가 실행
		a.method4(new Person() {	// 익명 객체를 대입
			@Override
			public void wake() {
				System.out.println("6시에 일어납니다.");
				eatMeal();
			}
			
			
			private void eatMeal() {
				System.out.println("식사를 합니다.");
			}
		});
	}

}
