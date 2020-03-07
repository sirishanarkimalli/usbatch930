package basics;

public class StrinngLiterals {

	public static void main(String[] args) {
		String s1= new String("one");
		String s2=new String("two");
		
		String s3="World";
		String s4="World";
        String s5=new String("World");
        
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
	}

}
