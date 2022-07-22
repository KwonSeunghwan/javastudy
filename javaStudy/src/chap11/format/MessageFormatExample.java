package chap11.format;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		String message = "오늘은 {0} 입니다. 날씨는 {1}. 구름이 있어서 {2} 않습니다.";
		String str1 = "목요일";
		String str2 = "맑습니다";
		String str3 = "덥지";
		System.out.println(MessageFormat.format(message, "목요일", "맑습니다", "덥지"));
		System.out.println(MessageFormat.format(message, str1, str2, str3));
		Object[] arguments = { str1, str2, str3};
		System.out.println(MessageFormat.format(message, arguments));

	}

}
