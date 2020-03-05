package basics;

public class StringClassDemo {

	public static void main(String[] args) {
		
		String s1= new String("Java Programming");
		String s2 ="Hello@Java Programming";
		String s3="java programming language";
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(2)); //v
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.startsWith("Java"));//boolean
		System.out.println(s1.endsWith("g"));//boolean
		s1=s1.concat(" Language");
		System.out.println(s1);
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.equals(s2));//boolean
		System.out.println(s1.equalsIgnoreCase(s3));//boolean
	
		System.out.println("String before Split : "+s1);
//		java programming language
		String[] words=s2.split("@");//delimeter  or separator is " "
		//enhanced for loop
		for(int i=0; i<words.length;i++) {
			System.out.println(words[i]);
		}
		
		for(String eachWord : words) {
			System.out.println(eachWord);
		}
		
		//India,Australia,England
		String s4 =String.join("$" ,"India","Australia","England");
		System.out.println(s4);
		
		System.out.println(s3.substring(0, 4));
		System.out.println(s1.substring(9));

	}

}
