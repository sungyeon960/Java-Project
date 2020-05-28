package java2005282;

public class SavingsAccount extends BankAccount{
	private double interestRate;//이자
	
	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	public void updateBalance(int period) {
		balance = (int) (balance*interestRate*period+balance);
	}
}
