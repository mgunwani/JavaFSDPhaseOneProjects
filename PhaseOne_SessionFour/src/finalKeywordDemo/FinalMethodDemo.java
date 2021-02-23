package finalKeywordDemo;

class PersonDetail {
	
	int id;
	String name;
	public PersonDetail() {
		super();
		this.id = 101;
		this.name = "Annonymous";
	}
	
	// Final Method can't be overridden in child class.
	public final void display() {
		System.out.println(this.id + " : " + this.name);
	}

}


class Employee extends PersonDetail {
	
	float salary;

	public Employee() {
		super();
		this.salary = 10000;
	}
	
	// Overridding: Redefine method with same name and signature in chid class.
	public void displayDetail() {
		System.out.println(this.salary);
	}

}

public class FinalMethodDemo {

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.display();
		obj.displayDetail();
		
	}
	
}
