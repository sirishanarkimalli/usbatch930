package basics;

class Test{
	//static block
	static {
		System.out.println("In static block");
	}
	
	//init block
	{
		System.out.println("In Init block 1");
	}
	{
		System.out.println("In Init block 2");
	}
	
	Test(){
		System.out.println("In COnstrutor");
	}
}


public class StaticInitConstructorDemo {
	public static void main(String args[])
	{		Test t = new Test();
	}	
}
