package chap11.string_method;

import java.io.UnsupportedEncodingException;

public class StringExample {

	public static void main(String[] args) {
		// 통신 : 서버와 통신 -> 바이트 단위로 전송 -> 바이트 배열(버퍼)
		// 문자열을 바이트 배열로 변환 : getBytes()
		byte[] bytes = "문자열".getBytes();
		for(int i = 0; i < bytes.length; i++) {
			System.out.print(bytes[i] + " ");
		}
		System.out.println();
		// 통신을 한다고 하면 한 바이트씩 전송
		
		try {
			// 한글 1바이트에 3바이트
			byte[] bytes2 = "문자열".getBytes("UTF-8");	// UTF-8로 인코딩 
			for(int i = 0; i < bytes2.length; i++) {
				System.out.print(bytes2[i] + " ");
			}
			System.out.println("-----------------------------");
			
			// 한글 1바이트에 조합형 2바이트
			byte[] bytes3 = "문자열".getBytes("EUC-KR");	// 조합형으로  인코딩 
			for(int i = 0; i < bytes3.length; i++) {
				System.out.print(bytes3[i] + " ");
			}
			
		} catch(UnsupportedEncodingException e) {	// 예외 처리 : 지원되지 않는 인코딩
			
		}

	}

}
