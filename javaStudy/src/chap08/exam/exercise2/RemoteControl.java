package chap08.exam.exercise2;

public interface RemoteControl {
	// 상수
	int MIN_TEMPERATURE = 0;
	int MAX_TEMPERATURE = 30;
	
	// 추상 메소드
	void turnOn();
	void turnoff();
	public void setTemperature(int temperature);

}
