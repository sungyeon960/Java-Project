package java200603;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount[] accounts;// 계좌
	private int numberOfAccounts;
	
	public Customer() {
		
	}

	// o
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accounts = new BankAccount[5];
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount(int index) {
		return accounts[index];
	}

	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts]=account;
		numberOfAccounts++;
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public String toString() {
		return "이름: " + firstName + lastName + ", 계좌의 갯수: "+numberOfAccounts;
	}

}
