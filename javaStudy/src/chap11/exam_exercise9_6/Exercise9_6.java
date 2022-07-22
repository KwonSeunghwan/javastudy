package chap11.exam_exercise9_6;

import java.util.Arrays;

public class Exercise9_6 {
	public static String fillZero(String src, int length) {

		if(src == null || src.length() == length) {	// 1
			return src;
		} else if(length <= 0) {	// 2
			return "";
		} else if(src.length() > length) {	// 3
			return src.substring(0, src.length());
		}
		char[] charArr = new char[length];	// 4
		Arrays.fill(charArr, '0'); // 5
		System.arraycopy(src.toCharArray(), 0, charArr, length - src.length();	// 6
		return new String(charArr);
		
}

	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));	// 0000012345
		System.out.println(fillZero(src,-1));	//
		System.out.println(fillZero(src,3));	// 123
		}
		}
