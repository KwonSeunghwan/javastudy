package chap15.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExamplem {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));

		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); // 하나씩 꺼내서
			// 꺼내지 않고 내용만 확인 : peek()
			switch (message.command) {	// 메시지 처리
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡를 보냅니다.");
				break;
			}
		}
	}

}
