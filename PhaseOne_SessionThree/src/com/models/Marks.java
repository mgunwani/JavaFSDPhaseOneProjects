package com.models;

class Marks extends Student {

	private int objectiveMarks;
	private int subjectiveMarks;

	public Marks() {
		this.objectiveMarks = 0;
		this.subjectiveMarks = 0;
	}

	public Marks(int objectiveMarks, int subjectiveMarks) {
		this.objectiveMarks = objectiveMarks;
		this.subjectiveMarks = subjectiveMarks;
	}

	protected int getObjectiveMarks() {
		return objectiveMarks;
	}

	protected void setObjectiveMarks(int objectiveMarks) {
		this.objectiveMarks = objectiveMarks;
	}

	protected int getSubjectiveMarks() {
		return subjectiveMarks;
	}

	protected void setSubjectiveMarks(int subjectiveMarks) {
		this.subjectiveMarks = subjectiveMarks;
	}

	void acceptDetails() {
		super.acceptDetails();
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
