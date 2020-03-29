package exceptionhandling;

class Account {

	// instance variables
	double balance = 500;
	int acno = 10;

	Account(int acno) {
		this.acno = acno;
	}

	public void withDraw(double amount) {
		try {
			balance -= amount;
			if (balance < 100) {
				throw new MinBalanceException("Invalid balance Amount");
			}
		} catch (MinBalanceException me) {
			System.out.println(me.getMessage());
		}

	}

	public void deposit(double amount) {
		balance += amount;
	}

	public double getBalance() {
		return balance;
	}

//	Overriden method of Object class
	@Override
	public String toString() {
		return "Acconunt no : " + acno;
	}

	public static void main(String[] args) {
		Account a= new Account(1);
		System.out.println("Before deposit"+a.getBalance());
		a.deposit(200);
		System.out.println("After deposit"+a.getBalance());
		
		a.withDraw(650);
		
	}

}
