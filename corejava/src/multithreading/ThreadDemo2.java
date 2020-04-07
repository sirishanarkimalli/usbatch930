package multithreading;

//Runnable is functional Interface
public class ThreadDemo2 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo2 mt = new ThreadDemo2();
		Thread t = new Thread(mt,"RunnableThread");

		t.start();
		}
}
