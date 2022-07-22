package chap10.user_defined_exception;

// 계좌 정보
public class Account {
	private long balance;	// 잔고
	public Account() { }
	public long getBalance() {
		return balance;
	}
	// 입금(money : 입금하는 돈)
	public void deposit(int money) {
		balance += money;
	}
	// 인출
	// 예외 처리를 하지 않고 나를 호출한 메소드가 예외 처리를 하도록 던져 버렸다.
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {	// 잔고 부족
			// 예외 발생
			throw new BalanceInsufficientException("잔고 부족:" + (money - balance));
		}
		// 잔고가 충분하면
		balance -= money;
	}

}
