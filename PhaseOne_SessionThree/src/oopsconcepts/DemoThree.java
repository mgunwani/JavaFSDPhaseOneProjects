//package oopsconcepts;
//
//import java.util.Scanner;
//
//class Student {
//	
//	int studentId;
//	String studentName;
//	int studentAge;
//	int studentFee;
//
//	Student() {
//		this.studentId = 1001;
//		this.studentName = "Shweta";
//		this.studentAge = 23;
//		this.studentFee = 12000;
//	}
//
//	public int getStudentId() {
//		return studentId;
//	}
//
//	public String getStudentName() {
//		return studentName;
//	}
//
//	public int getStudentAge() {
//		return studentAge;
//	}
//
//	public int getStudentFee() {
//		return studentFee;
//	}
//	
//	public void setStudentId(int studentId) {
//		this.studentId = studentId;
//	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//
//	public void setStudentAge(int studentAge) {
//		this.studentAge = studentAge;
//	}
//
//	public void setStudentFee(int studentFee) {
//		this.studentFee = studentFee;
//	}
//
//	
//	
//	
//	
//	void displayDetails() {
//		System.out.println("Student Id : " + this.getStudentId());
//		System.out.println("Student Name : " + this.getStudentName());
//		System.out.println("Student Age : " + this.getStudentAge());
//		System.out.println("Student Fee : " + this.getStudentFee());
//	}
//	
//	void acceptDetails() {
//		Scanner scan = new Scanner(System.in);	
//		System.out.print("Enter Your Name : ");
//		this.setStudentName(scan.nextLine());
//		System.out.print("Enter Your Id : ");
//		this.setStudentId(scan.nextInt());
//		System.out.print("Enter Your Age : ");
//		this.setStudentAge(scan.nextInt());
//		System.out.print("Enter Your Fees : ");
//		this.setStudentFee(scan.nextInt());
//	}
//}
//
//
//public class DemoThree {
//
//	public static void main(String[] args) {
//	
//		Student s1 = new Student();
//		
//		s1.acceptDetails();
//		s1.displayDetails();
//		
//		
//		
//		
//	}
//	
//}
