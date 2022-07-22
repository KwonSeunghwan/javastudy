package chap08.exam.exercise3;

public class Apartment {
	// 필드
	RemoteControl rc;
	
	// 생성자의 매개변수로 RemoteControl
	public Apartment(RemoteControl rc) {
		this.rc = rc;
	}
	
	void method1() {
		// 로켤변수
		RemoteControl rc = new RemoteControl() {
			int volume;
			// 익명 구현 객체 (Audio)
			// 작성 위치 (1)
			@Override
			public void turnOn() {
				System.out.println("Audio 전원을 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("Audio 전원을 끕니다.");
				
			}

			@Override
			public void setVolume(int volume) {
				if(volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME) {
						
					}
				}
				System.out.println("Audio 볼륨 : 20");
				
			}

			@Override
			public int getVolume() {
				return volume;
			}	
			

		};
		rc.turnOn();
		rc.setVolume(20);
		rc.getVolume();
		rc.turnOff();
	}
	
	// 매개변수로 RemoteControl을 사용
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(30);
		rc.getVolume();
		rc.setMute(true);
		rc.turnOff();
	}
}

