package java200522;

public class Account {
	private int balance;
	public final int MIN_BALANCE = 0;
	public final int MAX_BALANCE = 1000000;

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance>=MIN_BALANCE&&balance<=MAX_BALANCE) {
			this.balance=balance;
		}
	}
}
