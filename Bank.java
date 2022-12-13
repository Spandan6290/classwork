package spandan;
import java.util.Scanner;
public class Bank {
	public static void main(String[] args) {
		int bank_balance = 50000;
		int remaining_balance;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your option w(withdraw) or d(diposit)");
		char option = sc.next().charAt(0);
		
		if(option=='w') {
			System.out.println("Enter your withdrawn amount");
			int withdraw = sc.nextInt();
			if(withdraw>bank_balance) {
				System.out.println("Sorry you don't have that much balance");
			}
			
			else {
				remaining_balance=bank_balance-withdraw;
				System.out.println("Your withdraw is sucessfull");
				System.out.println("Your remaining balance is "+remaining_balance);
			}
		}
		
		else if(option=='d') {
			System.out.println("Enter your amount you want to diposit");
			int diposit = sc.nextInt();
			bank_balance = diposit+bank_balance;
			System.out.println(bank_balance);
		}
		
		else if (option!='w'||option!='d') {
			System.out.println("Enter correct option");
		}
	}
}
