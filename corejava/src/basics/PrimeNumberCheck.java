package basics;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		boolean isDivisible =false;
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number to check for prime:");
		int num=s.nextInt();
		
		for(int i=2; i<=num/2;i++) { 
			if(num%i==0) {
				isDivisible=true;
				break;
			}
		}
			if(!isDivisible) {
				System.out.println("Is a prime Number");
			}
			else {
				System.out.println("Not a prime Number");					
			}
	}
}


