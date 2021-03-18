package multithreading;

/**
 * 
 * @author BhawnaGunwani
 *
 * Thread Priority:
 * 	MIN_PRIORITY - 1
 *  MAX_PRIORITY - 10
 *  NORM_PRIORITY - 5
 */

class Thread1 extends Thread {

	public void run() {
		System.out.println("FirstThread is running..!!");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}

public class ThreadPriorityExample {

	public static void main(String[] args) {
		

		Thread1 ft1 = new Thread1();
		Thread1 ft2 = new Thread1();
		
		ft1.setName("ThreadOne");
		ft1.setPriority(Thread.MIN_PRIORITY);
		
		ft2.setName("ThreadTwo");
		ft2.setPriority(Thread.MAX_PRIORITY);
		
		
		ft1.start();
		System.out.println("------------------");
		ft2.start();
	}
}
