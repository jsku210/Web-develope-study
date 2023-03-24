
public class Account {
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	private int balance;

	public void setBalance(int a) {
		if(a<=0) {
			System.out.println("설정한값이"+Account.MIN_BALANCE+"보다 작습니다");
		}else if(a>Account.MIN_BALANCE && a<=Account.MAX_BALANCE) {
			balance = balance + a;
		}else if(a<Account.MAX_BALANCE) {
			System.out.println("설정한값이"+Account.MAX_BALANCE+"보다 큽니다 다시 설정하세요");
		}
	}
	public int getBalance() {
		return balance;
	}

}
