package chap10.try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {	// 예외가 발생할 수 있는 코드가 위치해야 한다.
		// Class.forName : 클래스를 메모리에 로딩하는 메소드
		Class clazz = Class.forName("java.lang.String2");	// 일반 예외 발생 : 컴파일시에 발생
			// 예외 처리를 해주어야 한다. -> try -catch-finally 구문을 사용
		} catch(ClassNotFoundException e) {	// catch문으로 예외문을 붙잡는다. -> 예외처리를 한다.
			// () 안에는 발생할 수 있는 예외를 기술한다.
			// e : 예외에 대한 정보가 실린다.
			// 예외처리를 한다. -> 운영자나 개발자에게 예외의 원인을 알린다. -> 로그 파일로 저장
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("예외의 발생 여부에 관계없이 무조건 실행이 된다.");
			// 보통 자원 반납을 한다.
		}

	}

}
