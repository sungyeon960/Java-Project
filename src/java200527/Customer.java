package java200527;

public class Customer extends BankAccount {
	private String firstName;
	private String lastName;
	private BankAccount[] account;// 계좌
	private int numberOfAccounts;
	
	public Customer() {
		
	}

	// o
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = new BankAccount[5];
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount(int index) {
		
		return account[index];
	}

	public void addAccount(BankAccount account) {
		numberOfAccounts++;
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public String toString() {
		return "이름: " + firstName + lastName + ", 잔고: "+account[numberOfAccounts].getBalance();
	}
}
