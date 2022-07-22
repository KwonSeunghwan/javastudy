package chap08.exam.exercise2;

public class Aircon implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void turnoff() {
		System.out.println("전원을 끕니다.");

	}

	@Override
	public void setTemperature(int temperature) {
		// TODO Auto-generated method stub

	}

}
