package chap06.singleton;

public class SingleTonExample {

	public static void main(String[] args) {
		// 싱글톤 객체를 사용하고 싶다.
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		if(s1 == s2) {	// 동일한 객체를 가리키므로 같은 값을 가진다.
			System.out.println("동일한 객체");
		} else {
			System.out.println("다른 객체");
		}
		s2.setValue(10);	// 싱글톤에 값을 저장
		System.out.println("저장된 값: " + s2.getValue());	// 싱글톤에 저장된 값을 읽을 수 있다.
		// 관리하는 창구가 하나
		// 어디서든지 접근할 수 있다.(클래스 이름으로 접근)
		
//		SingleTon s3 = new SingleTon():  // 호출 불가 -> 생성자의 접근제한자가 private이므로

	}

}
