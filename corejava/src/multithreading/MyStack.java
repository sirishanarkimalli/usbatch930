 package multithreading;

public class MyStack {
	int stack[] = new int[10];
	int top = 0;

	public  void push(int value) {
		System.out.println("Before Push " + value + "  by " + Thread.currentThread().getName());
		stack[top] = value;
		top++;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("After Push " + value + "  by " + Thread.currentThread().getName());
	}

	public  int pop() {
		top--;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		return (stack[top]);
	}

	public void print() {
		for (int val : stack)
			System.out.println(val);
	}
}
