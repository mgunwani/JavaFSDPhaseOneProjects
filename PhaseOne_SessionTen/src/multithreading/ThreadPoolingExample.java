package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author BhawnaGunwani
 *
 * Java Thread Pool:
 *  A group of worker threads that are waiting for the job and reuse many times.
 *  All threads in thread pool should be of fixed size.
 *  A thread from the thread pool is pulled out and assigned a job by the worker or provider.
 *  Once the job is completed, thread is contained in the thread pool again.
 */

class WorkerThread implements Runnable {
	
	public String message;
	public WorkerThread(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " starts." + this.message);
		sleepingThread();
		System.out.println(Thread.currentThread().getName() + " ends."  + this.message);
	}
	
	public void sleepingThread() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class ThreadPoolingExample {

	public static void main(String[] args) {
		
		/*
		 * WorkerThread wt1 = new WorkerThread(); WorkerThread wt2 = new WorkerThread();
		 * Thread t1 = new Thread(wt1); Thread t2 = new Thread(wt2);
		 * t1.start(); t2.start();
		 */
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread(" " + i);
			executor.execute(worker);
		}
		executor.shutdown();
		while(!executor.isTerminated()) { }
		System.out.println("Finished the execution of all threads from Thread Pool!!");
		

		
	}
	
}
