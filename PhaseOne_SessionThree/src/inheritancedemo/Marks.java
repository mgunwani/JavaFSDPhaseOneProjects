package inheritancedemo;

import java.util.Scanner;

public class Marks extends Student {

	int objectiveMarks;
	int subjectiveMarks;

	public Marks() {
		this.objectiveMarks = 0;
		this.subjectiveMarks = 0;
	}

	public Marks(int objectiveMarks, int subjectiveMarks) {
		this.objectiveMarks = objectiveMarks;
		this.subjectiveMarks = subjectiveMarks;
	}

	public int getObjectiveMarks() {
		return objectiveMarks;
	}

	public void setObjectiveMarks(int objectiveMarks) {
		this.objectiveMarks = objectiveMarks;
	}

	public int getSubjectiveMarks() {
		return subjectiveMarks;
	}

	public void setSubjectiveMarks(int subjectiveMarks) {
		this.subjectiveMarks = subjectiveMarks;
	}

	void acceptDetails() {
		super.acceptDetails();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Objective Marks : ");
		this.setObjectiveMarks(scan.nextInt());
		System.out.print("Enter Subjective Marks : ");
		this.setSubjectiveMarks(scan.nextInt());
	}

	void displayDetails() {
		super.displayDetails();
		System.out.println("Objective Marks : " + this.getObjectiveMarks());
		System.out.println("Subjective Marks : " + this.getSubjectiveMarks());
	}

}
