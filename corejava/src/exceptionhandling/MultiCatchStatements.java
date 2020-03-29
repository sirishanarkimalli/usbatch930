package exceptionhandling;

import java.io.File;
import java.util.Scanner;

public class MultiCatchStatements {

	public static void main(String[] args) {

		int a = 10, b = 4;
		int div;
		
		
		try(Scanner sc=new Scanner(System.in); ) {
		
			String s="Hello";
//			int n =Integer.parseInt(s);
			div = a / 0;
			System.out.println(div);
			int arr[]=new int[5];
			for(int i=0;i<=5;i++)
				arr[i]=i+1;
			
		} catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
//			System.out.println("In Catch Block");
//			e.printStackTrace();
			System.out.println(e.getMessage());
			//rethrow exception
			throw e;
		}finally {
		
			System.out.println("In Finally");
		}
		
	}

}