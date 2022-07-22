package chap10.user_defined_exception;

public class BalanceInsufficientException extends Exception {
	// default 생성자
	public BalanceInsufficientException() { }
	public BalanceInsufficientException(String message) {	// message : 에러의 원인
		super(message);	// 부모 Exception에게 전달
	}

}
