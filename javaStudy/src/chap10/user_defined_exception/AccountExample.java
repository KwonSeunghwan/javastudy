package chap10.user_defined_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		// 예금
		account.deposit(10000);
		System.out.println("예금액:" + account.getBalance());
		// 출금
		try {
			account.withdraw(30000); 	// 예외 처리를 해주어야 한다.
		} catch(BalanceInsufficientException e) {
			// 예외에 대한 정보가 e에 실린다.
			System.out.println(e.getMessage()); // 예외의 원인을 출력
			e.printStackTrace(); // 스택에 저장된 정보를 출력
			// 보통 예외가 발생되면 출력되는 내용이 e.PrintStackTrace()를 출력하는 것이다. 
		}
	}

}
