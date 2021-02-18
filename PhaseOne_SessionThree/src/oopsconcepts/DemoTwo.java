//package oopsconcepts;
//
//import java.util.Scanner;
//
//class Student extends Object {
//	
//	// Data Members/Variable at class Level/Attributes
//	int studentId;
//	String studentName;
//	int studentAge;
//	
//	// Creating Default Constructor:
//	Student() {
//		this.studentId = 1001;
//		this.studentName = "Unknown";
//		this.studentAge = 18;
//	}
//	
//	// Creating Parameterized Constructor:
//	Student(int id, String name, int age) {
//		this.studentId = id;
//		this.studentName = name;
//		this.studentAge = age;
//	}
//	
//	Student(String name, int id, int age) {
//		this.studentId = id;
//		this.studentName = name;
//		this.studentAge = age;
//	}
//	
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
//public class DemoTwo {
//
//	public static void main(String[] args) {
//		
//		// Creating an Object/Representator of class
//		Student s1 = new Student();
//		Student s2 = new Student(101, "Kochhar", 23);
//		Student s3 = new Student("Smith", 102, 32);
//		
//		s1.displayDetails();
//		s2.displayDetails();
//		s3.displayDetails();
//
//	}
//
//}
