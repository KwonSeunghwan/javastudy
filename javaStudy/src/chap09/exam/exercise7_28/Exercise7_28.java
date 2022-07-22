package chap09.exam.exercise7_28;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 익명 클래스 : 클래스 이름이 없음 -> 객체 생성시 부모 클래스 이름으로 생성자를 대신
 */
public class Exercise7_28 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
			// 부모의 메소드를 재정의
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing() 호출됨");
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});

	}

}

class EventHandler extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
}