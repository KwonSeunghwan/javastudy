package chap10.try_with_resource;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try (	// 자원을 얻는 부분을 프로그램을 한다. -> finally가 작성할 필요 없다.
				FileInputStream fis = new FileInputStream("file.txt");
				)
		{	// 예외가 발생할 수 있는 코드를 작성
			fis.read();
			throw new Exception();	// 예외를 강제로 발생 시킴
		} catch(Exception e) {	// 예외 처리
			// 예외가 발생되면 자동으로 closable() 메소드가 실행이 된다.
			// closable() 메소드가 실행이 되었음 -> 자원 반납
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}

	}

}
