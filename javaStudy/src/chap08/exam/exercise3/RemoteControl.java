package chap08.exam.exercise3;

public interface RemoteControl {
	int MIN_VOLUME = 0;
	int MAX_VOLUME = 100;

	void turnOn();
	void turnOff();
	void setVolume(int volume);
	int getVolume();

	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
}