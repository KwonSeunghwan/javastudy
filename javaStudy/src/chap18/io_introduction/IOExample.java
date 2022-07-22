package chap18.io_introduction;

/*
 * 입출력 스트림 : 데이터가 물 흐르듯이 바이트 단위로 전송되는 것을 스트림이란 의미로 해석 
 * 내 입장에서 데이터가 들어오면 입력 스트림
 * 내 입장에서 데이터가 나가면 출력 스트림
 * 보통 입력스트림과 출력스트림의 쌍으로 존재한다.
 * - InputStream/OutStream : 바이트 단위로 전송하는 최상위 클래스 -> 추상 클래스
 *  + FileInputStream : 파일을 읽을 때
 *  BufferedInputStream : Buffer를 사용해서 효율을 높인다.(오버헤드를 줄인다.)
 *  DataInputSteam : 데이터 타입 형태로 데이터를 입력 받는다. (int, short, long, double..)
 *   -> 순서가 중요하다. : int short long long -> 보내는 측에 데이터 순서와 받는 측의 순서가 동일해야 함
 *  + ObjectInpurStream : 객체 단위로 입력 받는다. 약속을 잘해야 한다. (필드가 다르면 안된다.)
 *  + 이 클래스를 상속해서 여러 가지 기능을 제공하는 클래스를 사용
 *  + 제공하는 메소드
 *   * read(): 한 바이트씩 읽는다. -> 반환형은 int이다. -> 입력의 끝늘 나타내는 EOF(-1)인데 int 형이다.
 *   * read(byte[] b) : 배열에 저장한다. 최대로 읽을 수 있는 데이터는 버퍼의 크기만큼 읽고, 나머지를 읽으면, 
 *   	나머지 만큼 읽은 바이트 수가 반환된다.
 *   * read(byte[] b, int off, int len) : 배열의 off위치 부터 len 크기에 저장
 *   * close() : InputStream 자원을 반납할 때 사용. 입력이 완료되면 자원을 반납해준다.
 *  + 모든 I/O 동작은 예외가 발생할 수 있으므로 예외 처리를 해주어야 한다.
 *  - Reader/Writer : 문자 단위로 전송하는 최상위 클래스
 */

public class IOExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
