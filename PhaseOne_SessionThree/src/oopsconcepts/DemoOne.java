//package oopsconcepts;
//
//import java.util.Scanner;
//
//class Student {
//	
//	// Data Members/Variable at class Level/Attributes
//	int studentId;
//	String studentName;
//	int studentAge;
//	
//	// Member Functions/Methods/Functions at Level/Modules
//	void acceptsDetails() {
//		Scanner scan = new Scanner(System.in);	
//	
//		System.out.print("Enter Your Name : "); // Bhawna Gunwani
//		this.studentName = scan.nextLine();
//		System.out.print("Enter Your Id : ");
//		this.studentId = scan.nextInt();
//		System.out.print("Enter Your Age : ");
//		this.studentAge = scan.nextInt();
//	
//	}
//	
//	void displayDetails() {
//		System.out.println("Student Details : ");
//		System.out.println("Id : " + this.studentId);
//		System.out.println("Name : " + this.studentName);
//		System.out.println("Age : " + this.studentAge);
//	}
//}
//
//
//
//public class DemoOne {
//
//	public static void main(String[] args) {
//		
//		// Creating an Object/Representator of class
//		Student s1 = new Student();
//		Student s2 = new Student();
//		
//		
//		s1.acceptsDetails();
//		s1.displayDetails();
//		
//		s2.displayDetails();
//		
//
//	}
//
//}
