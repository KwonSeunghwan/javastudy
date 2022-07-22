package chap15.stack_queue;

public class Message {
	public String command;	// 명령어
	public String to;		// 목적지
	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	}
	
}
