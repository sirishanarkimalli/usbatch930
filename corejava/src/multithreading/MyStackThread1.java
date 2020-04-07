package multithreading;

public class MyStackThread1 implements Runnable {

	MyStack stackObj;
	Thread t;

	public MyStackThread1(String name, MyStack s) {
		stackObj = s;
		t = new Thread(this, name);
		t.start();
	}

	public void run() {
		synchronized (stackObj) {
			stackObj.push(10);
		}
	}

	public static void main(String[] args) {
		MyStack s = new MyStack();
		MyStackThread1 t1 = new MyStackThread1("Thread1 ", s);
		MyStackThread1 t2 = new MyStackThread1("Thread2 ", s);
		MyStackThread1 t3 = new MyStackThread1("Thread3 ", s);

	}

}
