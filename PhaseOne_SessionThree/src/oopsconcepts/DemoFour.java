package oopsconcepts;

import java.util.Scanner;

import models.Employee;


class Student {
	
	// Data Members/Variable at class Level/Attributes
	private int studentId;
	private String studentName;
	private int studentAge;
	
	// Member Functions/Methods/Functions at Level/Modules
	void acceptsDetails() {
		Scanner scan = new Scanner(System.in);	
	
		System.out.print("Enter Your Name : "); // Bhawna Gunwani
		this.studentName = scan.nextLine();
		System.out.print("Enter Your Id : ");
		this.studentId = scan.nextInt();
		System.out.print("Enter Your Age : ");
		this.studentAge = scan.nextInt();
	
	}
	
	void displayDetails() {
		System.out.println("Student Details : ");
		System.out.println("Id : " + this.studentId);
		System.out.println("Name : " + this.studentName);
		System.out.println("Age : " + this.studentAge);
	}
}



public class DemoFour {

	public static void main(String[] args) {

		Student s1 = new Student();
		
		s1.acceptsDetails();
		// s1.studentName = "Shruti";
		s1.displayDetails();
		
		Employee emp1 = new Employee();
		emp1.empId = 1001;
		emp1.empName = "Bhawna";
		
		

	}

}
