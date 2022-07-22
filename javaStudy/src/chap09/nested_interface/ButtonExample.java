package chap09.nested_interface;

public class ButtonExample {

	public static void main(String[] args) {
		Button btna = new Button();
		// onClick : 이벤트 ( 사용자가 버튼을 누르는 것)
		// 처리 핸들러 : 어떤 행동을 하는 것
		btna.setOnClickListener(new CallListener());
		btna.touch();	// 버튼을 눌러서 내부적으로 처리 -> 전화를 건다.
		
		Button btnb = new Button();
		btnb.setOnClickListener(new MessageListener());
		btnb.touch(); 	// 버튼을 누르는 동작을 한다.

	}

}
