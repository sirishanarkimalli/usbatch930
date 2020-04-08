package multithreading;

public class TestSharedMethod implements Runnable {

	NewClass nc = null;
	String msg = null;
	Thread t = null;

	public TestSharedMethod(String msg,NewClass nc) {
		this.msg = msg;
		this.nc = nc;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		nc.sharedMethod(msg);
	}

	public static void main(String[] args) {
		TestSharedMethod t1, t2;
		NewClass nc= new NewClass();
		t1 = new TestSharedMethod("Java",nc);
		t2 = new TestSharedMethod("Python",nc);
	}

}
