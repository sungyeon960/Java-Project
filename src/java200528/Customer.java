package java200528;

public class Customer extends BankAccount {
	private String firstName;
	private String lastName;
	private BankAccount account;// 계좌
	
	public Customer() {
		
	}

	// o
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public String toString() {
		return "이름: " + firstName + lastName + ", 잔고: "+String.format("%,d",account.getBalance());
	}
}
