package java200603;

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
			protectedBy.balance=protectedBy.balance- (amount-balance);
			balance = 0;
			return false;
		}
		else {
			System.out.println(amount-balance);
			return true;
		}
	}
	
	@Override
	public String getAccountType() {
		return "당좌예금";
	}
}
