package multithreading;

public class NewClass {
	
	public  void sharedMethod(String msg) {
		System.out.print("[ "+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.print("] ");
	}

}
