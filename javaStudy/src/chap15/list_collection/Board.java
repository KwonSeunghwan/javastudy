package chap15.list_collection;

public class Board {
	String subject;	// 제목
	String content; // 내용
	String writter;	// 작성자
	
	// todtjdwk
	public Board(String subject, String content, String writter) {
		super();
		this.subject = subject;
		this.content = content;
		this.writter = writter;
	}
	
	// getter/setter
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWritter() {
		return writter;
	}

	public void setWritter(String writter) {
		this.writter = writter;
	}

	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writter=" + writter + "]";
	}
	
	
	

}
