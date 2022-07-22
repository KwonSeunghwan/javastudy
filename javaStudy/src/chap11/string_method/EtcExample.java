package chap11.string_method;

public class EtcExample {

	public static void main(String[] args) {
		// toLowerCase() : 소문자로 변환
		System.out.println("JAVA PROGRAMMING".toLowerCase());
		// toUpperCase() : 대문자로 변환
		System.out.println("java programming".toUpperCase());
		// trim() : 앞 뒤 공백을 잘라낸다. -> 없앤다.
		String oldStr = "  java programming  ";
		String newStr = oldStr.trim();
		System.out.println(oldStr);
		System.out.println("---------------");
		System.out.println(newStr);
		System.out.println("---------------");
		System.out.println("java programming\tstudy\n\nenjoy java".trim());
		// valueOf(10), valueOf(5.5)
		String str1 = String.valueOf(10);	// int -> String
		System.out.println(str1);
		String str2 = String.valueOf(5.5);	// double -> String
		System.out.println(str2);
	}

}
