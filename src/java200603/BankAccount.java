package java200603;

public abstract class BankAccount {
	protected int balance;
	
	public abstract String getAccountType();
	
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
		if(amount<0||amount>balance) {
			throw new IllegalArgumentException(); 
		}
		if(otherAccount==null) {
			throw new NullPointerException(); 
		}
		otherAccount.deposit(amount);
		this.withdraw(amount);
		return true;
	}
	public String toString() {
		return Integer.toString(balance);
	}
}