package basics;

public class StaticInstanceAccessibilityDemo {
//1. Calling static method from instance method
//2. Calling instance method from static method.
	
	public void method1() {
		System.out.println("Instance Method");
		method2();
	}
	
	public static void method2() {
		System.out.println("Statc method");
	}
	
	
	public void method3() {
		
	}
	
	public static void method4() {
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
