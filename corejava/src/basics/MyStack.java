package basics;

interface Stack {
	 void push(int val);
	 int pop();
	 int length();
	 
	 default String defaultMethod() {
		 return "Stack Default Method";
	 }
	 
	 static void getName() {
		 System.out.println("Stack Implementations");
	 }
}

interface Display {
	void print();
}

public class MyStack implements Stack,Display {
	int arr[] = new int[5];
	int top = 0;

	public void push(int val) {
		arr[top++] = val;
	}

	public int pop() {
		int val = arr[--top];
		return val;
	}
	
	public int length() {
		return top;
	}

	public void print() {
		System.out.println("Method of Display interface");
	}
	
	public void display() {
		for (int val : arr)
			System.out.print(val + " ");
	}

	public static void main(String[] args) {
//		An interface reference can hold an object of a class that implements the interface 
		Stack m = new MyStack();
		m.push(10);
		m.push(20);
		//call default method of interface 
		m.defaultMethod();
		//Static method
		Stack.getName();
		Display d= new MyStack();
	    d.print();	    
	    MyStack ms= new MyStack();
		System.out.println(m.pop());
	}

}
