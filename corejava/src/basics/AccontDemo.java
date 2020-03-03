package basics;

class Account {
	static final double interestRate = 0.6;

	double balance = 1000;

	public void withDraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void print() {
		System.out.println("In Account class Print");
	}
}

class SavingsAccount extends Account {

	String accountType = "Savings Account";

	// method overriding
	public void print1() {
		System.out.println("In SavingsAccount class Print");
	}

}

class CurrentAccount extends Account {

	String accountType = "Current Account";

	public void print() {
		System.out.println("In CurrentAccount class Print");
	}
}

public class AccontDemo {

	public static void main(String[] args) {
		Test t1= new Test();
		Test t2=t1;
		Account a = new Account();//object
		a.print();
		Account a1;//ref
		SavingsAccount sa = new SavingsAccount();
		a = sa;
		a.print();

		CurrentAccount ca = new CurrentAccount();
		a = ca;
		a.print();
	}

}
