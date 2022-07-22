package chap07.abstract_class;

// 필요하면 다시 추상 클래스를 만든다.
public abstract class DmbPhone extends Phone {
	int channel;

	public DmbPhone(String owner) {
		super(owner);
		
	}
	
	// 추상메소드는 재정의를 해야한다.
	// 재정의하지 않으면 추상메소드가 된다. -> abstract 키워드를 메소드에 붙여준다.
	// 추상메소드가 있는 클래스는 추상클래스이다. -> abstract 키워드를 클래스에 붙여준다.
	@Override
	public abstract void setVolume(int volume);
	
	public void setChannel(int channel);

}
