package basics;

public class NumberReverse {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);//"237" 237
		int n=num;
		int rem=0, revNum=0;
		while(num!=0) {
			rem=num%10; //5%10 =5
			revNum=revNum*10+rem;//230+5=235
			num=num/10;//=0
		}
		System.out.println("Original Number="+n);
		System.out.println("Reverse Number="+revNum);
		
		if(n==revNum) 
			System.out.println("Is a Palindrome");
		else
			System.out.println("Not a Palindrome");
			
	}

}
