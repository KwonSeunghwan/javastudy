package chap07.exam.exercise7_10;

public class Exercise7_10 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());

	}

}
// 필드를 외부에서 수정할 수 없도록 접근제한자를 사용 -> private
// 같은 패키지 내에서 : default
// 상속관계 : protected
// 제한이 없음 : public
class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	/*
	 * (1) . 알맞은 코드를 넣어 완성하시오
	 */
	// Getter/Setter 
	
	
}

