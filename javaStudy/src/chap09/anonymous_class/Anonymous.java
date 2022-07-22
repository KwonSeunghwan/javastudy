package chap09.anonymous_class;

public class Anonymous {	// 클래스
	// 필드
	Person field = new Kildong(); // 자식 객체를 대입
	// 익명 객체를 대입 : 한번만 사용. 별도로 클래스 파일을 만들지 않겠다.
	// 익명 객체 -> 생성자가 없음 -> 생성자로 부모클래스를 사용
	Person field2 = new Person() {	// 객체를 생성해서 대입
		// 클래스의 정의부
		public void wake() {
			System.out.println("7시 30분에 일어납니다.");
			gotoSchool();
		};
		
		private void gotoSchool() {
			System.out.println("학교에 갑니다.");
		}
		
	};
	// 생성자 
	public Anonymous(Person p) {	// 생성자의 매개변수로 부모 객체 Person을 사용
		this.field = p;
	}
	// 메소드 
	void method1() {
		field.wake(); 	// 필드를 사용
				
	}
	
	void method2() {
		// 로컬 변수에 익명 객체를 대입
		Person p2 = new Person() {	// 익명 객체를 대입
			// 익명 객체의 정의부
			@Override
			public void wake() {
				System.out.println("9시에 일어납니다.");
				walk();	// 산책을 한다.
			}
			
			private void walk() {
				System.out.println("산책을 합니다.");
			}
			
		};
		p2.wake();	// wake() 메소드를 호출
	}
	
	// 메소드 : 매개변수에 익명객체를 대입
	void method4(Person p) {
		p.wake();
	}

}
