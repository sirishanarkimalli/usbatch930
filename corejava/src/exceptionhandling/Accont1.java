package exceptionhandling;

class Account1 {

	// instance variables
	double balance = 500;
	int acno = 10;

	Account1(int acno) {
		this.acno = acno;
	}

	public void withDraw(double amount) throws MinBalanceException{
		
			balance -= amount;
			if (balance < 100) {
				throw new MinBalanceException("Invalid balance Amount");
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

	public static void main(String[] args)throws MinBalanceException {
		Account1 a= new Account1(1);
		System.out.println("Before deposit"+a.getBalance());
		a.deposit(200);
		System.out.println("After deposit"+a.getBalance());
//		try {
		a.withDraw(650);
//		}catch(MinBalanceException me) {
//			
//		}
	}

}
