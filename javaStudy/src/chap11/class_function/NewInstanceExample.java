package chap11.class_function;

/*
 * 사용 예 : JSP를 사용해서 웹 애플리케이션을 만들 때
 * Controller에서 사용
 * Controller : 브라우저에서 올라오는 url에 따라서 그 url을 처리하는 핸들러를 매핑을 시켜준다.
 * 핸들러가 interface를 사용하고 url에 따라서 그것을 처리하는 구현 객체를 매핑을 시켜준다.
 * 그 때 구현객체를 newInstance() 메소드를 사용해서 생성 후 HashMap에 저장을 합니다.
 */

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("chap11.class_funtion.SendAction");
			// 객체를 생성하는 것 : new SendAction()와 같은 것
			// newInstance() 메소드 실행 시, 객체가 default 생성자가 존재해야 한다.
			Action action = (Action)clazz.newInstance();	// 자동 타입 변환
			action.execute();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
