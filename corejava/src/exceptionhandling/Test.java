package exceptionhandling;

public class Test {

	public static void main(String[] args) {

		int a = 10, b = 4;
		int div;
		String s1=null;
		try {
			String s="23";
			int n =Integer.parseInt(s);//23
			div = a / b;
			System.out.println(div);
			s1.toUpperCase();			
		}
		catch (ArithmeticException ae) {
			System.out.println("Division by Zero.Enter a valid value"+ae.getMessage());
		}catch(NumberFormatException ne) {
			System.out.println("Enter integer. Converting string value to int is not poss");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
