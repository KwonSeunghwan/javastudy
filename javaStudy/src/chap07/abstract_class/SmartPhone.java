package chap07.abstract_class;

// 추상클래스는 상속 받아 구체화 한다.

public class SmartPhone extends Phone {
	int volume;
	
	public SmartPhone(String owner) {
		super(owner);
		
	}

	// 추상 메소드는 반드시 재정의를 해줘야 한다.
	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("현재 볼륨 : " + volume);

	}
	
	// 자식의 메소드를 추가
	public void internetSearch() {
		System.out.println("인터넷을 검색합니다.");
	}

}
