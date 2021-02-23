package statickeyworddemo;

class Counter {
	//	Non-Static Data Members(Instance Data Members)
	int newCount = 0;
	//	Static Data Members
	static int count = 0;
	Counter() {
		Counter.count++;
		this.newCount++;
	}	
	public void getCount() {
		System.out.println("Value of Counter : " + Counter.count);
		System.out.println("Value of Counter : " + this.newCount);
	}
}


public class CounterStaticExample {

	public static void main(String[] args) {	
		Counter c1 = new Counter();
		c1.getCount();
		Counter c2 = new Counter();
		c2.getCount();
		Counter c3 = new Counter();
		c3.getCount();
	}
}
