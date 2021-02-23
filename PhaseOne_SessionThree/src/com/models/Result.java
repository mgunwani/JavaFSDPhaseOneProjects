package com.models;

public class Result extends Sport {

	private int totalMarks;
	private float averageMarks;
	
	public void calculateResult() {
		this.totalMarks = this.getObjectiveMarks() + this.getSubjectiveMarks() + this.getScore();
		this.averageMarks = this.totalMarks/3;
		System.out.println("Total Marks : " + this.totalMarks);
		System.out.println("Average Marks : " + this.averageMarks);
	}

}
