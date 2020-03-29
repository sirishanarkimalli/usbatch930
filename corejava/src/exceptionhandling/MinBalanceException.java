package exceptionhandling;

public class MinBalanceException extends Exception{ 
	public MinBalanceException() {
		System.out.println("Minimun balance should be Rs 100");
	}
	
	public MinBalanceException(String msg) {
		super(msg);
	}
	
}
