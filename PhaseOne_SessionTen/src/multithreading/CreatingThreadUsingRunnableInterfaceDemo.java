package multithreading;

/**
 * 
 * @author BhawnaGunwani
 *
 * Creating Thread using Runnable Interface
 */


class SecondThread implements Runnable {

	@Override
	public void run() {
		System.out.println("SecondThread is running..!!");
	}
	
}

public class CreatingThreadUsingRunnableInterfaceDemo {

	public static void main(String[] args) {
		
		SecondThread st1 = new SecondThread();
		Thread t1 = new Thread(st1);
		t1.start();	
	}
}
