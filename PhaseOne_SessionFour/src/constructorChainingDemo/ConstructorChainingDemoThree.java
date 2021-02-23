package constructorChainingDemo;

class Person {
	int Id;
	String Name;
	String City;
	public Person(int id, String name, String city) {
		super();
		Id = id;
		Name = name;
		City = city;
	}
	public void DisplayDetails() {
		System.out.println("Id: " + this.Id);
		System.out.println("Name: " + this.Name);
		System.out.println("Name: " + this.City);
	}
}

class Employee extends Person {
	float Salary;
	public Employee(int id, String name, String city, float salary) {
		super(id, name, city);
		Salary = salary;
	}
	public void DisplayDetails() {
		super.DisplayDetails();
		System.out.println("Salary: " + this.Salary);
	}
}

public class ConstructorChainingDemoThree {

	public static void main(String[] args) {
		
		Employee emp = new Employee(101, "King Kochhar", "Delhi", 20000);
		emp.DisplayDetails();
		
	}
	
}
