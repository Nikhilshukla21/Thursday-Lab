/*Create an Account class.
States: accountNo,accHolderName,accBalance,accType(curent/saving)
behaviours: withdraw(),deposite(),createAccount(),checkBalance()
.withdraw()method is responsible to withdraw amount with verification that balance is sufficient or not.if not then print balance is insufficient.
.deposite() is responsible to deposite amountin the account
.createAccount() method is responsible to create account of user
.checkBalance() method is responsible to print mini statement with base on accountNo.
note:this application will be for single user and menu driven.
*/

package oops;

import java.util.Scanner;

class Account {
	// instance variable
	private long accountNo;
	private String accHolderName;
	private int accBalance;
	private String accType;

	// constructor
	public Account(long accountNo, String accHolderName, int accBalance, String accType) {

		this.accountNo = accountNo;
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
		this.accType = accType;
	}

	public void withdraw(int amount) {// Method for balance withdraw
		if (amount > this.accBalance)
			System.out.println("There is not sufficient balance in your account");
		else {
			this.accBalance = this.accBalance - amount;
			System.out.println("Your account is credited with:" + amount);
			System.out.println("Your account balance is:" + this.accBalance);
			System.out.println("Thank you!");
		}
	}

	public void deposit(int amount) {// Method for balannce deposit
		this.accBalance = this.accBalance + amount;
		System.out.println("Your account is credited with:" + amount);
		System.out.println("Your account balance is: " + this.accBalance);
		System.out.println("Thank you!");
	}

	public void check() {// Method for balance check
		System.out.println("Your account balance is: " + this.accBalance);
		System.out.println("Thank you!");
	}
}

public class BankAccountDetails {
	public static void main(String[] args) {
		int choice, amt;// Declare variable
		Account Customer = new Account(456266556, "Nikhil", 2000, "Saving");
		System.out.println("Welcome to Apna bank");
		System.out.println("=========================================================");
		System.out.println("Please enter your choice!");
		System.out.println("Press 1 for check balance\nPress 2 for Deposit amount\nPress 3 for Withdrow");
		System.out.println("=========================================================");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();

		switch (choice) {// Taking choice from user
		case 1:
			Customer.check();
			break;
		case 2:
			System.out.println("Enter the amount which you want to Deposit");
			amt = sc.nextInt();// Taking input amount from user
			Customer.deposit(amt);
			break;
		case 3:
			System.out.println("Enter the amount which you want to Withdraw");
			amt = sc.nextInt();// Taking input amount from user
			Customer.withdraw(amt);
			break;
		default:
			System.out.println("Enter a valid choice");
		}

	}
}
