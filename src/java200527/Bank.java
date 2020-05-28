package java200527;

public class Bank {
	private Customer[] customers; // 고객목록
	private int numberOfCustomers; // 고객수
	
	public Bank() {
		this.customers = new Customer[10]; // 10 초기화
	}
	public void addCustomer(Customer customer) {
		//customer를 배열에 할당
		customers[numberOfCustomers]=customer;
		numberOfCustomers++;// 증가
	}
	public int getNumberOfCustomer() {
		return numberOfCustomers;
	}
	public Customer[] getCustomers() {
		return customers;
	}
	public Customer getCustomer(int index) {
		return customers[index];
	}
}
