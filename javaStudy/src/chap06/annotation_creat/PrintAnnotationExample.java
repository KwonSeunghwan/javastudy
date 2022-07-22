package chap06.annotation_creat;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// 리플렉트를 사용해서 메소드 정보를 얻는다.
		// 클래스 Service의 메소드 정보를 얻음.
		Method[] declarMethods = Service.class.getDeclaredMethods();
		for(Method method : declarMethods) {	// 각 메소드 별로 어노테이션이 적용된 메소드를 찾는다.
			// method1(), method2(), method3() 반복된다.
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				// 메소드에 적용된 어노테이션 정보를 가져온다.(value, number 정보를 가져온다.)
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				// 메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				// 어노테이션을 적용 : value에 설정된 문자를 number에 설정된 갯수 만큼 출력 -> 어노테이션을 구현
				for(int i = 0;1 < printAnnotation.number();i++) {
					System.out.print(printAnnotation.vlaue());
				}
				System.out.println();
				try {	// ???
					method.invoke(new Service());
				} catch(Exception e) { }
				System.out.println();
				
				
			}
		}

	}

}
