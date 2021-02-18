package inheritancedemo;

import java.util.Scanner;

public class Student {

	int studentId;
	String studentName;

	public Student() {
		this.studentId = 101;
		this.studentName = "Unknown";
	}

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	void acceptDetails() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		this.setStudentName(scan.nextLine());
		System.out.print("Enter Your Id : ");
		this.setStudentId(scan.nextInt());
	}

	void displayDetails() {
	System.out.println("Student Id : " + this.getStudentId());
	System.out.println("Student Name : " + this.getStudentName());	
	}
}
