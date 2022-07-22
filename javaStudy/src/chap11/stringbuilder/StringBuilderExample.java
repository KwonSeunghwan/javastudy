package chap11.stringbuilder;

/* 문자열 연결을 하는  + 의 단점 : 메모리의 낭비, 기존 문자열을 유지하면서 새로운 문자열이 생긴다.
 * 문자열을 효과적으로 조작할 수 있는 방법이 필요 -> StringBuilder 나 StringBuffer가 제공
 * 무한대로 문자열을 저장할 수 있고, 문자열 조작을 위한 다양한 메소드로 제공
 * 크기를 자동으로 조절해 준다.
 * StringBuffer : 멀티 스레드 환경에서 사용
 * StringBuilder : 단일 스레드 환경에서 사용
 * 
 */
public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();	// 객체 생성 : 일정 크기의 버퍼가 생성됨
		sb.append("java ").append("Program Study");	// cascading을 지원
		System.out.println(sb.toString());	// toString() 메소드를 사용해서 문자열로 변환
		
		sb.insert(4, "2");	// 중간에 임의의 위치에 문자열을 추가 가능
		System.out.println(sb.toString());
		sb.setCharAt(4,'6');	// 특정한 위치에 문자 한 개를 대체
		System.out.println(sb.toString());
		sb.replace(6, 13,"Book");	// replace : 대체 -> 13은 포함이 안된다.
		System.out.println(sb.toString());
		sb.delete(4, 5);	// 4~5 -> 5는 포함이 안됨
		System.out.println(sb.toString());
		int length=sb.length();
		System.out.println("총문자수:"+length);
		String result=sb.toString();
		System.out.println(result);

		
	}

}
