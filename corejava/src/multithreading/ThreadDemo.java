package multithreading;

class MyThread1 extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
			System.out.println("MyThread1 :" +i);
	}
}

class MyThread2 extends Thread{
	
//	@Override
	public void run() {
//		for(int i=1;i<=5;i++)
//			System.out.println("MyThread2 :" +i);
	}
}


public class ThreadDemo {

	public static void main(String[] args) {
		MyThread1 m =new MyThread1();
		m.start();
		MyThread2 m2 =new MyThread2();
		m2.start();
		
		for(int i=1;i<=5;i++)
			System.out.println("Main Thread :" +i);
	}

}
