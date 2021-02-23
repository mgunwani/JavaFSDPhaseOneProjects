package com.models;

class Sport extends Marks {
	
	private int score;

	public Sport() {
		this.score  = 0;
	}

	public Sport(int score) {
		this.score = score;
	}
	
	protected int getScore() {
		return score;
	}

	protected void setScore(int score) {
		this.score = score;
	}
	
	public void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Sports Score : ");
		this.setScore(scan.nextInt());
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Sports Score : " + this.getScore());
	}


}
