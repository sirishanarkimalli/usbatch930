package basics;

import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoinerClassDemo {

	public static void main(String[] args) {
		StringJoiner sj= new StringJoiner("," , "[" ,"]" );
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter strings : ");
		String word=s.nextLine();
		while(word!=null & word.length()!=0){			
			sj.add(word);
			word=s.nextLine();
		}
		 
		System.out.println(sj.toString());
	}

}
