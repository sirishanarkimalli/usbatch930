package basics;

public class StaticInstanceAccessibilityDemo {
//1. Calling static method from instance method
//2. Calling instance method from static method.
	
	public void method1() {
		System.out.println("Instance Method 1");
		method2();
	}
	
	public static void method2() {
		System.out.println("Static method 2");
	}
	
	
	public void method3() {
		System.out.println("Instance Method 3");
	}
	
	public static void method4() {
		System.out.println("Static method 4");
	}
	
	
	
	public static void main(String[] args) {
			new StaticInstanceAccessibilityDemo().method3();
			method4();

	}

}
