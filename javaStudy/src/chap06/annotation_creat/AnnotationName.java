package chap06.annotation_creat;

/* annotation을 정의하기 위한 표기법 : @interface를 사용
 * 파라미터를 입력받을 수 있음
 * 타입 elementName() [default];
 */

public @interface AnnotationName {
	String elementName1();	// 파라미터
	int elementName2() default 5;	// element2가 없으면 5가 입력이 된다.

}
