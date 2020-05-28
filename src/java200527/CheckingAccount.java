package java200527;

public class CheckingAccount extends BankAccount{
	private SavingsAccount protectedBy;
	
	public CheckingAccount(int balance) {
		super(balance);
	}
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy=protectedBy;
	}
	
	@Override
	public boolean withdraw(int amount) {
		if(amount>balance) {
			protectedBy.updateBalance(amount);
			return true;
		}
		else {
			return false;
		}
	}
}
