package multithreading;

class MyThread1 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
//			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
	}
}


public class JoiningThreadExample {
	
	public static void main(String[] args) throws InterruptedException {
	
		MyThread1 t1 = new MyThread1();
		t1.setName("Thread One");
		MyThread1 t2 = new MyThread1();
		t2.setName("Thread Two");
		MyThread1 t3 = new MyThread1();
		t3.setName("Thread Three");
		
		t1.start();
		
		t1.join();
		
		t2.start();
		t3.start();
		
	}
	

}
