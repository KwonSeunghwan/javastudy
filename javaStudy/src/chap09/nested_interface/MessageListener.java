package chap09.nested_interface;

import chap09.nested_interface.Button.OnClickListener;

public class MessageListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("문자 메시지를 전송합니다.");

	}

}
