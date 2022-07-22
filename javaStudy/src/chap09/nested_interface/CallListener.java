package chap09.nested_interface;

import chap09.nested_interface.Button.OnClickListener;

public class CallListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
