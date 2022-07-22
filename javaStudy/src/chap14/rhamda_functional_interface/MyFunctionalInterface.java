package chap14.rhamda_functional_interface;

// 람다식을 대입받는 인터페이스 -> 람다식을 정의한다.
// 람다식 : 추상 메소드가 하나만 존재

@FunctionalInterface	// 함수적인인터페이스에는 @FunctionalInterface 어노테이션을 붙여준다.
public interface MyFunctionalInterface {
	// 추상 메소드를 하나만 정의 -> 형식을 정의한다.
	
	public void method();

}
