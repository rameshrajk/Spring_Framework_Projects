package com.raj.spring.springcore.reftypes;

public class Student {

	private Scores scores;

	public Scores getScores() {
		return scores;
	}

	@Override
	public String toString() {
		return "Student [scores=" + scores + "]";
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

}
