package multithreading;

class MyThreadA extends Thread {

	MyThreadA(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}
}

class MyThreadB extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}

}

public class ThreadDemo1 {

	public static void main(String args[]) throws InterruptedException {
		MyThreadA m = new MyThreadA("First Thread");
		m.start();
		System.out.println(m.getPriority());
		

		MyThreadB m2 = new MyThreadB();
		m2.setName("Second Thread");
		m2.start();
		
		System.out.println(m.isAlive());
		System.out.println(m2.isAlive());
		// priority between 1- 10
		m2.setPriority(9);
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);

			Thread.sleep(1000);

		}
		System.out.println(m.isAlive());
		System.out.println(m2.isAlive());
	}
}
	