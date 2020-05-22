package java200522;

import java.util.Scanner;

public class BankApplication {
	private static BankAccount[] accounts = new BankAccount[100];
	
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = s.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
	}
	// 계좌생성
	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i]==null) {
				System.out.print("계좌번호: ");
				String accountNo = s.next();

				System.out.print("계좌주: ");
				String owner = s.next();
				System.out.print("초기입금액: ");
				int balance = s.nextInt();
				BankAccount ba = new BankAccount(accountNo, owner, balance);
				accounts[i]=ba;
				break;
			}
		}
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	// 계좌목록
	private static void accountList() {
		//null아닌것 
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i]!=null) {
				System.out.println(accounts[i].getAccountNo()+"\t"+ accounts[i].getOwner()+"\t"+accounts[i].getBalance());
			}
		}
	}

	// 예금하기
	private static void deposit() {
		String accountNo;
		int amount;
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		accountNo = s.next();
		System.out.print("예금액: ");
		amount = s.nextInt();
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i]==findAccount(accountNo)) {
				accounts[i].setBalance(accounts[i].getBalance()+amount);
				System.out.println("결과: 예금이 완료되었습니다.");
			}
		}
	}

	// 출금하기
	private static void withdraw() {
		String accountNo;
		int amount;
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		accountNo = s.next();
		System.out.print("출금액: ");
		amount = s.nextInt();
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i]==findAccount(accountNo)) {
				accounts[i].setBalance(accounts[i].getBalance()-amount);
				System.out.println("결과: 출금이 완료되었습니다.");
			}
		}
	}
	
	private static BankAccount findAccount(String accountNo) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getAccountNo().equals(accountNo)) {
				return accounts[i];
			}
		}
		return null;
	}	
}
