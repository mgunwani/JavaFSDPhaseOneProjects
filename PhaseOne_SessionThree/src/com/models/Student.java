package com.models;

import java.util.Scanner;

public class Student {

	private int studentId;
	private String studentName;
	public static String universityName;
	Scanner scan = new Scanner(System.in);
	// Static Block to Initialize Static Variables
	static {
		Student.universityName = "BVU";
	}
	
	public Student() {
		this.studentId = 101;
		this.studentName = "Unknown";
	}

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	protected int getStudentId() {
		return studentId;
	}

	protected void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	protected String getStudentName() {
		return studentName;
	}

	protected void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	void acceptDetails() {		
		System.out.print("Enter Your Name : ");
		this.setStudentName(scan.nextLine());
		System.out.print("Enter Your Id : ");
		this.setStudentId(scan.nextInt());
	}

	void displayDetails() {
	System.out.println("Student Id : " + this.getStudentId());
	System.out.println("Student Name : " + this.getStudentName());
	System.out.println("University Name : " + Student.universityName);
	}
}
