package innerclasses;

interface Stack{
	void push(int val);
	int pop();
}

class Outer1{
	
	public Stack getStack() {
		return new Stack() {
			public void push(int val) {
				System.out.println("in push " + val);
			}

			public int pop() {
				return 1;
			}
		};		
	}
}

public class AnonymousClassTest {

	public static void main(String[] args) {
		Outer1 obj= new Outer1();
		Stack stack=obj.getStack();
		stack.push(10);
		stack.push(30);		
		stack.pop();
	}
}
