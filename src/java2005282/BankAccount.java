package java2005282;

public class BankAccount {
	protected int balance;

	public BankAccount() {
	}
	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		// 입금
		this.balance = balance + amount;
	}

	public boolean withdraw(int amount) {
		// 출금
		if (amount > balance) {
			return false;
		} else {
			this.balance = balance - amount;
			return true;
		}
	}
	public boolean transfer(int amount, BankAccount otherAccount) {
		// 현재계좌에서 다른 계좌로 송금
		this.withdraw(amount);
		otherAccount.deposit(amount);
		return true;
	}
	public String toString() {
		return Integer.toString(balance);
	}
}