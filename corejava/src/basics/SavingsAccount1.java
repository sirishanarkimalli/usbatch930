package basics;

import java.io.Serializable;

public class SavingsAccount1 extends Account1 implements Serializable {

	static String ACCOUNT_TYPE = "savings account";
	double balance;

	public SavingsAccount1(int acno, String accountName, String email) {
		super(acno, accountName, email);
		this.balance = 500;
	}

	public final double withDraw(double amount) {
		balance -= amount;
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void displayAccountDetails() {
		super.displayAccountDetails();
		System.out.println("Balance: " + balance);
		System.out.println();
	}

	@Override
	public String toString() {
		return this.acno + "\n" + this.accountName + "\n" + this.balance;
	}

	public static void main(String args[]) {
		SavingsAccount1 sa1 = new SavingsAccount1(1, "james", "james@gmail.com");
		SavingsAccount1 sa2 = new SavingsAccount1(3, "George", "george@gmail.com");

		sa1.withDraw(100);
		sa1.deposit(200);
		sa1.displayAccountDetails();
		sa2.displayAccountDetails();

		Account1 a1 = sa1;// upcasting
		SavingsAccount1 sa = (SavingsAccount1) a1;// downcasting
	}

}
