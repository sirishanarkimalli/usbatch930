package basics;

public  abstract class Account1 {
	
	int acno;
	String accountName;
	String email;
	
	
	public Account1(int acno,String accountName,String email ) {		
		this.acno= acno;
		this.accountName= accountName;
		this.email=email;
	}	
		
	public abstract double withDraw(double amount);
	
	public abstract void deposit(double amount);
	
	public void displayAccountDetails() {
		System.out.println("Account num: "+acno);
		System.out.println("Account name: "+accountName);
		System.out.println("Email: " +email);
		
	}
	

}
