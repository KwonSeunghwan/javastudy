package chap18.assist_stream;

import java.io.Serializable;

public class ClassC implements Serializable {
	// 명시적으로 클래스의 serialVersingUID를 기술
	// 컴파일을 다시 하더라고 같은 버전을 유지
	private static final long serialVersionUID = 1L;
	// 명시적으로 serialVersing를 기술하지 않으면 컴파일러가 자동으로 발생시킨다.
	// 다시 컴파일을 하면 다름 값으로 변경된다. -> 다른 버전의 클래스가 된다.
	int field1;
//	int field2;	// 하나의 필드를 더 추가 -> 클래스의 내용이 변경됨 -> 다른 버전이 된다.
}