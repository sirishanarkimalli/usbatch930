package basics;

public class BoxingUnboxingDemo {

	public static void main(String[] args) {
		int n=10;
		//Boxing
		Integer n1= new Integer(n); 
		
		//unboxing
		int n2= n1.intValue();
		
		//java 5.0
//		Autoboxing
		Integer n3=20;
		
		//Autounboxing
		int n4=n3;
	}

}
