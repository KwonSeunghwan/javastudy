package chap11.format;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		// 숫자 형식 : DecimalFormat
		DecimalFormat df = new DecimalFormat("#,###.0");	// 3자리수로 ,를 붙여주고 소수점 1자리까지
		System.out.println(df.format(1234567.89));	// 1,234,567.9
	}

}
