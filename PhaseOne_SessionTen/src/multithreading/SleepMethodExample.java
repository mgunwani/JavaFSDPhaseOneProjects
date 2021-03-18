package multithreading;

class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i);
		}
	}
}


public class SleepMethodExample {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.start();
		t2.start();
		
	}
}
