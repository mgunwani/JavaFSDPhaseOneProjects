package multithreading;

/**
 * 
 * @author BhawnaGunwani
 *
 *	Creating Thread using ThreadClass
 */

class FirstThread extends Thread {

	public void run() {
		System.out.println("FirstThread is running..!!");
	}
}

public class CreatingThreadUsingThreadClassDemo {

	public static void main(String[] args) {
		
		FirstThread ft1 = new FirstThread();
		ft1.start();
		ft1.start();
		
		
	}
}
