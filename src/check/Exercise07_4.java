package check;

import java.util.Scanner;

public class Exercise07_4 {

	public static void main(String[] args) {
			boolean run = true;
			int balance = 0, a,b;
			Scanner s = new Scanner(System.in);
			
			while(run) {
				System.out.println("------------------------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("------------------------------------------");
				System.out.print("선택 >> ");
				
				a = s.nextInt();
				
				if(a==1) {
					System.out.print("예금액>");
					b = s.nextInt();
					balance+=b;
				}
				else if(a==2) {
					System.out.print("출금>");
					b = s.nextInt();
					balance-=b;
				}
				else if(a==3) {
					System.out.println("잔고>"+balance);
				}
				else {
					break;
				}
			}
			System.out.println("프로그램 종료");
			
			s.close();		
		}
	}
